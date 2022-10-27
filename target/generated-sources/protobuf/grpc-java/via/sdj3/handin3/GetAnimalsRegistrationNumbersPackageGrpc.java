package via.sdj3.handin3;

import io.grpc.stub.StreamObserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: services.proto")
public final class GetAnimalsRegistrationNumbersPackageGrpc {

  private GetAnimalsRegistrationNumbersPackageGrpc() {}

  public static final String SERVICE_NAME = "handin3.GetAnimalsRegistrationNumbersPackage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.handin3.PackageId,
      via.sdj3.handin3.Package> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = via.sdj3.handin3.PackageId.class,
      responseType = via.sdj3.handin3.Package.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.handin3.PackageId,
      via.sdj3.handin3.Package> getGetMethod() {
    io.grpc.MethodDescriptor<via.sdj3.handin3.PackageId, via.sdj3.handin3.Package> getGetMethod;
    if ((getGetMethod = GetAnimalsRegistrationNumbersPackageGrpc.getGetMethod) == null) {
      synchronized (GetAnimalsRegistrationNumbersPackageGrpc.class) {
        if ((getGetMethod = GetAnimalsRegistrationNumbersPackageGrpc.getGetMethod) == null) {
          GetAnimalsRegistrationNumbersPackageGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<via.sdj3.handin3.PackageId, via.sdj3.handin3.Package>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.PackageId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.handin3.Package.getDefaultInstance()))
              .setSchemaDescriptor(new GetAnimalsRegistrationNumbersPackageMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetAnimalsRegistrationNumbersPackageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersPackageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersPackageStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersPackageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetAnimalsRegistrationNumbersPackageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageBlockingStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersPackageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersPackageBlockingStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersPackageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetAnimalsRegistrationNumbersPackageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetAnimalsRegistrationNumbersPackageFutureStub>() {
        @java.lang.Override
        public GetAnimalsRegistrationNumbersPackageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetAnimalsRegistrationNumbersPackageFutureStub(channel, callOptions);
        }
      };
    return GetAnimalsRegistrationNumbersPackageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GetAnimalsRegistrationNumbersPackageImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(via.sdj3.handin3.PackageId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.Package> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.handin3.PackageId,
                via.sdj3.handin3.Package>(
                  this, METHODID_GET)))
          .build();
    }

      public abstract void Get(PackageId id, StreamObserver<Package> responseObserver);
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersPackageStub extends io.grpc.stub.AbstractAsyncStub<GetAnimalsRegistrationNumbersPackageStub> {
    private GetAnimalsRegistrationNumbersPackageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersPackageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersPackageStub(channel, callOptions);
    }

    /**
     */
    public void get(via.sdj3.handin3.PackageId request,
        io.grpc.stub.StreamObserver<via.sdj3.handin3.Package> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersPackageBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetAnimalsRegistrationNumbersPackageBlockingStub> {
    private GetAnimalsRegistrationNumbersPackageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersPackageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersPackageBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.handin3.Package get(via.sdj3.handin3.PackageId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetAnimalsRegistrationNumbersPackageFutureStub extends io.grpc.stub.AbstractFutureStub<GetAnimalsRegistrationNumbersPackageFutureStub> {
    private GetAnimalsRegistrationNumbersPackageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetAnimalsRegistrationNumbersPackageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetAnimalsRegistrationNumbersPackageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.handin3.Package> get(
        via.sdj3.handin3.PackageId request) {
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
    private final GetAnimalsRegistrationNumbersPackageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetAnimalsRegistrationNumbersPackageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((via.sdj3.handin3.PackageId) request,
              (io.grpc.stub.StreamObserver<via.sdj3.handin3.Package>) responseObserver);
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

  private static abstract class GetAnimalsRegistrationNumbersPackageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetAnimalsRegistrationNumbersPackageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.handin3.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetAnimalsRegistrationNumbersPackage");
    }
  }

  private static final class GetAnimalsRegistrationNumbersPackageFileDescriptorSupplier
      extends GetAnimalsRegistrationNumbersPackageBaseDescriptorSupplier {
    GetAnimalsRegistrationNumbersPackageFileDescriptorSupplier() {}
  }

  private static final class GetAnimalsRegistrationNumbersPackageMethodDescriptorSupplier
      extends GetAnimalsRegistrationNumbersPackageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetAnimalsRegistrationNumbersPackageMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetAnimalsRegistrationNumbersPackageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetAnimalsRegistrationNumbersPackageFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
