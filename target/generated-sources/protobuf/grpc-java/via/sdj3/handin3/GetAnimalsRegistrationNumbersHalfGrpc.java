package via.sdj3.handin3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: services.proto")
public final class GetAnimalsRegistrationNumbersHalfGrpc {

  private GetAnimalsRegistrationNumbersHalfGrpc() {}

  public static final String SERVICE_NAME = "handin3.GetAnimalsRegistrationNumbersHalf";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.handin3.HalfAnAnimalId,
      via.sdj3.handin3.HalfAnAnimal> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = via.sdj3.handin3.HalfAnAnimalId.class,
      responseType = via.sdj3.handin3.HalfAnAnimal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.handin3.HalfAnAnimalId,
      via.sdj3.handin3.HalfAnAnimal> getGetMethod() {
    io.grpc.MethodDescriptor<via.sdj3.handin3.HalfAnAnimalId, via.sdj3.handin3.HalfAnAnimal> getGetMethod;
    if ((getGetMethod = GetAnimalsRegistrationNumbersHalfGrpc.getGetMethod) == null) {
      synchronized (GetAnimalsRegistrationNumbersHalfGrpc.class) {
        if ((getGetMethod = GetAnimalsRegistrationNumbersHalfGrpc.getGetMethod) == null) {
          GetAnimalsRegistrationNumbersHalfGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<via.sdj3.handin3.HalfAnAnimalId, via.sdj3.handin3.HalfAnAnimal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.HalfAnAnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.HalfAnAnimal.getDefaultInstance()))
              .setSchemaDescriptor(new GetAnimalsRegistrationNumbersHalfMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetAnimalsRegistrationNumbersHalfStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersHalfStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersHalfStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersHalfStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetAnimalsRegistrationNumbersHalfBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfBlockingStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersHalfBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersHalfBlockingStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersHalfBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetAnimalsRegistrationNumbersHalfFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersHalfFutureStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersHalfFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersHalfFutureStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersHalfFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GetAnimalsRegistrationNumbersHalfImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(via.sdj3.handin3.HalfAnAnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.HalfAnAnimal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.handin3.HalfAnAnimalId,
                via.sdj3.handin3.HalfAnAnimal>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersHalfStub extends io.grpc.stub.AbstractAsyncStub<GetAnimalsRegistrationNumbersHalfStub> {
    private GetAnimalsRegistrationNumbersHalfStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersHalfStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersHalfStub(channel, callOptions);
    }

    /**
     */
    public void get(via.sdj3.handin3.HalfAnAnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.HalfAnAnimal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersHalfBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetAnimalsRegistrationNumbersHalfBlockingStub> {
    private GetAnimalsRegistrationNumbersHalfBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersHalfBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersHalfBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.handin3.HalfAnAnimal get(via.sdj3.handin3.HalfAnAnimalId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersHalfFutureStub extends io.grpc.stub.AbstractFutureStub<GetAnimalsRegistrationNumbersHalfFutureStub> {
    private GetAnimalsRegistrationNumbersHalfFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersHalfFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersHalfFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.handin3.HalfAnAnimal> get(
        via.sdj3.handin3.HalfAnAnimalId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetAnimalsRegistrationNumbersHalfImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetAnimalsRegistrationNumbersHalfImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((via.sdj3.handin3.HalfAnAnimalId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.handin3.HalfAnAnimal>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GetAnimalsRegistrationNumbersHalfBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetAnimalsRegistrationNumbersHalfBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.handin3.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetAnimalsRegistrationNumbersHalf");
    }
  }

  private static final class GetAnimalsRegistrationNumbersHalfFileDescriptorSupplier
      extends GetAnimalsRegistrationNumbersHalfBaseDescriptorSupplier {
    GetAnimalsRegistrationNumbersHalfFileDescriptorSupplier() {}
  }

  private static final class GetAnimalsRegistrationNumbersHalfMethodDescriptorSupplier
      extends GetAnimalsRegistrationNumbersHalfBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetAnimalsRegistrationNumbersHalfMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetAnimalsRegistrationNumbersHalfGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetAnimalsRegistrationNumbersHalfFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
