package via.sdj3.handin3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: services.proto")
public final class GetAnimalProductsGrpc {

  private GetAnimalProductsGrpc() {}

  public static final String SERVICE_NAME = "handin3.GetAnimalProducts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.handin3.AnimalId,
      via.sdj3.handin3.AnimalProducts> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = via.sdj3.handin3.AnimalId.class,
      responseType = via.sdj3.handin3.AnimalProducts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.handin3.AnimalId,
      via.sdj3.handin3.AnimalProducts> getGetMethod() {
    io.grpc.MethodDescriptor<via.sdj3.handin3.AnimalId, via.sdj3.handin3.AnimalProducts> getGetMethod;
    if ((getGetMethod = GetAnimalProductsGrpc.getGetMethod) == null) {
      synchronized (GetAnimalProductsGrpc.class) {
        if ((getGetMethod = GetAnimalProductsGrpc.getGetMethod) == null) {
          GetAnimalProductsGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<via.sdj3.handin3.AnimalId, via.sdj3.handin3.AnimalProducts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.AnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.AnimalProducts.getDefaultInstance()))
              .setSchemaDescriptor(new GetAnimalProductsMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetAnimalProductsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsStub>() {
        @java.lang.Override
        public GetAnimalProductsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalProductsStub(channel, callOptions);
        }
      };
    return GetAnimalProductsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetAnimalProductsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsBlockingStub>() {
        @java.lang.Override
        public GetAnimalProductsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalProductsBlockingStub(channel, callOptions);
        }
      };
    return GetAnimalProductsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetAnimalProductsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalProductsFutureStub>() {
        @java.lang.Override
        public GetAnimalProductsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalProductsFutureStub(channel, callOptions);
        }
      };
    return GetAnimalProductsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GetAnimalProductsImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(via.sdj3.handin3.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.AnimalProducts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.handin3.AnimalId,
                via.sdj3.handin3.AnimalProducts>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class GetAnimalProductsStub extends io.grpc.stub.AbstractAsyncStub<GetAnimalProductsStub> {
    private GetAnimalProductsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalProductsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalProductsStub(channel, callOptions);
    }

    /**
     */
    public void get(via.sdj3.handin3.AnimalId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.AnimalProducts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetAnimalProductsBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetAnimalProductsBlockingStub> {
    private GetAnimalProductsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalProductsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalProductsBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.handin3.AnimalProducts get(via.sdj3.handin3.AnimalId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetAnimalProductsFutureStub extends io.grpc.stub.AbstractFutureStub<GetAnimalProductsFutureStub> {
    private GetAnimalProductsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalProductsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalProductsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.handin3.AnimalProducts> get(
        via.sdj3.handin3.AnimalId request) {
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
    private final GetAnimalProductsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetAnimalProductsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((via.sdj3.handin3.AnimalId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.handin3.AnimalProducts>) responseObserver);
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

  private static abstract class GetAnimalProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetAnimalProductsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.handin3.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetAnimalProducts");
    }
  }

  private static final class GetAnimalProductsFileDescriptorSupplier
      extends GetAnimalProductsBaseDescriptorSupplier {
    GetAnimalProductsFileDescriptorSupplier() {}
  }

  private static final class GetAnimalProductsMethodDescriptorSupplier
      extends GetAnimalProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetAnimalProductsMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetAnimalProductsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetAnimalProductsFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
