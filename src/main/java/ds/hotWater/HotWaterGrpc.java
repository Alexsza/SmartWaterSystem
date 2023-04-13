package ds.hotWater;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: hotWater.proto")
public final class HotWaterGrpc {

  private HotWaterGrpc() {}

  public static final String SERVICE_NAME = "hotWater.HotWater";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.hotWater.SetTankTemperatureRequest,
      ds.hotWater.SetTankTemperatureResponse> getSetTankTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTankTemperature",
      requestType = ds.hotWater.SetTankTemperatureRequest.class,
      responseType = ds.hotWater.SetTankTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.hotWater.SetTankTemperatureRequest,
      ds.hotWater.SetTankTemperatureResponse> getSetTankTemperatureMethod() {
    io.grpc.MethodDescriptor<ds.hotWater.SetTankTemperatureRequest, ds.hotWater.SetTankTemperatureResponse> getSetTankTemperatureMethod;
    if ((getSetTankTemperatureMethod = HotWaterGrpc.getSetTankTemperatureMethod) == null) {
      synchronized (HotWaterGrpc.class) {
        if ((getSetTankTemperatureMethod = HotWaterGrpc.getSetTankTemperatureMethod) == null) {
          HotWaterGrpc.getSetTankTemperatureMethod = getSetTankTemperatureMethod = 
              io.grpc.MethodDescriptor.<ds.hotWater.SetTankTemperatureRequest, ds.hotWater.SetTankTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hotWater.HotWater", "SetTankTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.hotWater.SetTankTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.hotWater.SetTankTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotWaterMethodDescriptorSupplier("SetTankTemperature"))
                  .build();
          }
        }
     }
     return getSetTankTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.hotWater.SendUsageDataRequest,
      ds.hotWater.SendUsageDataResponse> getSendUsageDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUsageData",
      requestType = ds.hotWater.SendUsageDataRequest.class,
      responseType = ds.hotWater.SendUsageDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.hotWater.SendUsageDataRequest,
      ds.hotWater.SendUsageDataResponse> getSendUsageDataMethod() {
    io.grpc.MethodDescriptor<ds.hotWater.SendUsageDataRequest, ds.hotWater.SendUsageDataResponse> getSendUsageDataMethod;
    if ((getSendUsageDataMethod = HotWaterGrpc.getSendUsageDataMethod) == null) {
      synchronized (HotWaterGrpc.class) {
        if ((getSendUsageDataMethod = HotWaterGrpc.getSendUsageDataMethod) == null) {
          HotWaterGrpc.getSendUsageDataMethod = getSendUsageDataMethod = 
              io.grpc.MethodDescriptor.<ds.hotWater.SendUsageDataRequest, ds.hotWater.SendUsageDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "hotWater.HotWater", "SendUsageData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.hotWater.SendUsageDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.hotWater.SendUsageDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotWaterMethodDescriptorSupplier("SendUsageData"))
                  .build();
          }
        }
     }
     return getSendUsageDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotWaterStub newStub(io.grpc.Channel channel) {
    return new HotWaterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotWaterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotWaterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotWaterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotWaterFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class HotWaterImplBase implements io.grpc.BindableService {

    /**
     */
    public void setTankTemperature(ds.hotWater.SetTankTemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.hotWater.SetTankTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTankTemperatureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.hotWater.SendUsageDataRequest> sendUsageData(
        io.grpc.stub.StreamObserver<ds.hotWater.SendUsageDataResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendUsageDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetTankTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.hotWater.SetTankTemperatureRequest,
                ds.hotWater.SetTankTemperatureResponse>(
                  this, METHODID_SET_TANK_TEMPERATURE)))
          .addMethod(
            getSendUsageDataMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.hotWater.SendUsageDataRequest,
                ds.hotWater.SendUsageDataResponse>(
                  this, METHODID_SEND_USAGE_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HotWaterStub extends io.grpc.stub.AbstractStub<HotWaterStub> {
    private HotWaterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotWaterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotWaterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotWaterStub(channel, callOptions);
    }

    /**
     */
    public void setTankTemperature(ds.hotWater.SetTankTemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.hotWater.SetTankTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTankTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.hotWater.SendUsageDataRequest> sendUsageData(
        io.grpc.stub.StreamObserver<ds.hotWater.SendUsageDataResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendUsageDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HotWaterBlockingStub extends io.grpc.stub.AbstractStub<HotWaterBlockingStub> {
    private HotWaterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotWaterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotWaterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotWaterBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.hotWater.SetTankTemperatureResponse setTankTemperature(ds.hotWater.SetTankTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTankTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HotWaterFutureStub extends io.grpc.stub.AbstractStub<HotWaterFutureStub> {
    private HotWaterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotWaterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotWaterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotWaterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.hotWater.SetTankTemperatureResponse> setTankTemperature(
        ds.hotWater.SetTankTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTankTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TANK_TEMPERATURE = 0;
  private static final int METHODID_SEND_USAGE_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotWaterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotWaterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TANK_TEMPERATURE:
          serviceImpl.setTankTemperature((ds.hotWater.SetTankTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<ds.hotWater.SetTankTemperatureResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_USAGE_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendUsageData(
              (io.grpc.stub.StreamObserver<ds.hotWater.SendUsageDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HotWaterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotWaterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.hotWater.HotWaterImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotWater");
    }
  }

  private static final class HotWaterFileDescriptorSupplier
      extends HotWaterBaseDescriptorSupplier {
    HotWaterFileDescriptorSupplier() {}
  }

  private static final class HotWaterMethodDescriptorSupplier
      extends HotWaterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotWaterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HotWaterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotWaterFileDescriptorSupplier())
              .addMethod(getSetTankTemperatureMethod())
              .addMethod(getSendUsageDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
