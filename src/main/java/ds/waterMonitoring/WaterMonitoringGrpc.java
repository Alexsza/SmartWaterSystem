package ds.waterMonitoring;

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
    comments = "Source: waterMonitoring.proto")
public final class WaterMonitoringGrpc {

  private WaterMonitoringGrpc() {}

  public static final String SERVICE_NAME = "waterMonitoring.WaterMonitoring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.waterMonitoring.MonitorAreaRequest,
      ds.waterMonitoring.MonitorAreaResponse> getMonitorAreaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorArea",
      requestType = ds.waterMonitoring.MonitorAreaRequest.class,
      responseType = ds.waterMonitoring.MonitorAreaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.waterMonitoring.MonitorAreaRequest,
      ds.waterMonitoring.MonitorAreaResponse> getMonitorAreaMethod() {
    io.grpc.MethodDescriptor<ds.waterMonitoring.MonitorAreaRequest, ds.waterMonitoring.MonitorAreaResponse> getMonitorAreaMethod;
    if ((getMonitorAreaMethod = WaterMonitoringGrpc.getMonitorAreaMethod) == null) {
      synchronized (WaterMonitoringGrpc.class) {
        if ((getMonitorAreaMethod = WaterMonitoringGrpc.getMonitorAreaMethod) == null) {
          WaterMonitoringGrpc.getMonitorAreaMethod = getMonitorAreaMethod = 
              io.grpc.MethodDescriptor.<ds.waterMonitoring.MonitorAreaRequest, ds.waterMonitoring.MonitorAreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "waterMonitoring.WaterMonitoring", "MonitorArea"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterMonitoring.MonitorAreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterMonitoring.MonitorAreaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterMonitoringMethodDescriptorSupplier("MonitorArea"))
                  .build();
          }
        }
     }
     return getMonitorAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.waterMonitoring.SendSensorDataRequest,
      ds.waterMonitoring.SendSensorDataResponse> getSendSensorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSensorData",
      requestType = ds.waterMonitoring.SendSensorDataRequest.class,
      responseType = ds.waterMonitoring.SendSensorDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.waterMonitoring.SendSensorDataRequest,
      ds.waterMonitoring.SendSensorDataResponse> getSendSensorDataMethod() {
    io.grpc.MethodDescriptor<ds.waterMonitoring.SendSensorDataRequest, ds.waterMonitoring.SendSensorDataResponse> getSendSensorDataMethod;
    if ((getSendSensorDataMethod = WaterMonitoringGrpc.getSendSensorDataMethod) == null) {
      synchronized (WaterMonitoringGrpc.class) {
        if ((getSendSensorDataMethod = WaterMonitoringGrpc.getSendSensorDataMethod) == null) {
          WaterMonitoringGrpc.getSendSensorDataMethod = getSendSensorDataMethod = 
              io.grpc.MethodDescriptor.<ds.waterMonitoring.SendSensorDataRequest, ds.waterMonitoring.SendSensorDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "waterMonitoring.WaterMonitoring", "SendSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterMonitoring.SendSensorDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.waterMonitoring.SendSensorDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterMonitoringMethodDescriptorSupplier("SendSensorData"))
                  .build();
          }
        }
     }
     return getSendSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterMonitoringStub newStub(io.grpc.Channel channel) {
    return new WaterMonitoringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterMonitoringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterMonitoringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterMonitoringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterMonitoringFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class WaterMonitoringImplBase implements io.grpc.BindableService {

    /**
     */
    public void monitorArea(ds.waterMonitoring.MonitorAreaRequest request,
        io.grpc.stub.StreamObserver<ds.waterMonitoring.MonitorAreaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorAreaMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.waterMonitoring.SendSensorDataRequest> sendSensorData(
        io.grpc.stub.StreamObserver<ds.waterMonitoring.SendSensorDataResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendSensorDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorAreaMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.waterMonitoring.MonitorAreaRequest,
                ds.waterMonitoring.MonitorAreaResponse>(
                  this, METHODID_MONITOR_AREA)))
          .addMethod(
            getSendSensorDataMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.waterMonitoring.SendSensorDataRequest,
                ds.waterMonitoring.SendSensorDataResponse>(
                  this, METHODID_SEND_SENSOR_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterMonitoringStub extends io.grpc.stub.AbstractStub<WaterMonitoringStub> {
    private WaterMonitoringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterMonitoringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterMonitoringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterMonitoringStub(channel, callOptions);
    }

    /**
     */
    public void monitorArea(ds.waterMonitoring.MonitorAreaRequest request,
        io.grpc.stub.StreamObserver<ds.waterMonitoring.MonitorAreaResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.waterMonitoring.SendSensorDataRequest> sendSensorData(
        io.grpc.stub.StreamObserver<ds.waterMonitoring.SendSensorDataResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendSensorDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterMonitoringBlockingStub extends io.grpc.stub.AbstractStub<WaterMonitoringBlockingStub> {
    private WaterMonitoringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterMonitoringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterMonitoringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterMonitoringBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.waterMonitoring.MonitorAreaResponse> monitorArea(
        ds.waterMonitoring.MonitorAreaRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorAreaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class WaterMonitoringFutureStub extends io.grpc.stub.AbstractStub<WaterMonitoringFutureStub> {
    private WaterMonitoringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterMonitoringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterMonitoringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterMonitoringFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_AREA = 0;
  private static final int METHODID_SEND_SENSOR_DATA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterMonitoringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterMonitoringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_AREA:
          serviceImpl.monitorArea((ds.waterMonitoring.MonitorAreaRequest) request,
              (io.grpc.stub.StreamObserver<ds.waterMonitoring.MonitorAreaResponse>) responseObserver);
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
        case METHODID_SEND_SENSOR_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendSensorData(
              (io.grpc.stub.StreamObserver<ds.waterMonitoring.SendSensorDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WaterMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterMonitoringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.waterMonitoring.WaterMonitoringImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterMonitoring");
    }
  }

  private static final class WaterMonitoringFileDescriptorSupplier
      extends WaterMonitoringBaseDescriptorSupplier {
    WaterMonitoringFileDescriptorSupplier() {}
  }

  private static final class WaterMonitoringMethodDescriptorSupplier
      extends WaterMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterMonitoringMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterMonitoringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterMonitoringFileDescriptorSupplier())
              .addMethod(getMonitorAreaMethod())
              .addMethod(getSendSensorDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
