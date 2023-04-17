package ds.hotWater;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ds.hotWater.HotWaterGrpc;
import ds.hotWater.TankTempConfirm;
import ds.hotWater.UsageDataResponse;
import ds.hotWater.desiredTankTemp;
import ds.hotWater.HotWaterGrpc.HotWaterBlockingStub;
import ds.hotWater.HotWaterGrpc.HotWaterStub;
import ds.hotWater.desiredTankTemp.Builder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import ds.GUI.*;

public class Client {

	private static HotWaterBlockingStub blockingStub;
	private static HotWaterStub asyncStub;
	private MainGUIApplication guiApp;
	
	public Client() {
		guiApp = new MainGUIApplication();
	}
	
	public void connect() {
		guiApp.initializeClient();
	}

	public static void main(String[] args) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

			// stubs -- generate from proto
			blockingStub = HotWaterGrpc.newBlockingStub(channel);

			asyncStub = HotWaterGrpc.newStub(channel);

			setTankTemperature();

			SendUsageData();

			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					try {
						channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	// unary rpc
	public static void setTankTemperature() {
		int desiredTemp = 65;

		desiredTankTemp req = desiredTankTemp.newBuilder().setDesiredTemp(desiredTemp).build();

		// retrieving reply from service
		TankTempConfirm response = blockingStub.setTankTemperature(req);

		System.out.println("Tank temperature setting to: " + response.getConfirmation());
	}

	// client side streaming
	private static void SendUsageData() {
		StreamObserver<UsageDataResponse> responseObserver = new StreamObserver<UsageDataResponse>() {

			public void onNext(UsageDataResponse msg) {
				System.out.println("receiving hot water data ");
				System.out.println("Recommendation based on incoming data: " + msg.getRecommendation());
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("Stream is completed ... receiving converted info");

			}

		};

		StreamObserver<UsageDataRequest> requestObserver = asyncStub.sendUsageData(responseObserver);
		try {
			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(68).setTankLevel(800).setFlowRate(10)
					.setWaterPressure(40).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(72).setTankLevel(780).setFlowRate(11)
					.setWaterPressure(45).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(65).setTankLevel(750).setFlowRate(12)
					.setWaterPressure(44).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(70).setTankLevel(735).setFlowRate(11)
					.setWaterPressure(43).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(71).setTankLevel(700).setFlowRate(12)
					.setWaterPressure(42).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(74).setTankLevel(683).setFlowRate(10)
					.setWaterPressure(41).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(66).setTankLevel(655).setFlowRate(13)
					.setWaterPressure(43).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(63).setTankLevel(610).setFlowRate(12)
					.setWaterPressure(45).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(68).setTankLevel(578).setFlowRate(9)
					.setWaterPressure(47).build());
			Thread.sleep(500);

			requestObserver.onNext(UsageDataRequest.newBuilder().setHotWaterTemp(70).setTankLevel(545).setFlowRate(10)
					.setWaterPressure(41).build());
			Thread.sleep(500);

			// Mark the end of requests
			requestObserver.onCompleted();

			Thread.sleep(10000);

		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}


}
