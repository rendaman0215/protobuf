package com.argus.pdf.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  PDFのサービス
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: argus/pdf/v1/pdf.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PDFServiceGrpc {

  private PDFServiceGrpc() {}

  public static final String SERVICE_NAME = "argus.pdf.v1.PDFService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.argus.pdf.v1.GetPDFRequest,
      com.argus.pdf.v1.GetPDFResponse> getGetPDFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPDF",
      requestType = com.argus.pdf.v1.GetPDFRequest.class,
      responseType = com.argus.pdf.v1.GetPDFResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.argus.pdf.v1.GetPDFRequest,
      com.argus.pdf.v1.GetPDFResponse> getGetPDFMethod() {
    io.grpc.MethodDescriptor<com.argus.pdf.v1.GetPDFRequest, com.argus.pdf.v1.GetPDFResponse> getGetPDFMethod;
    if ((getGetPDFMethod = PDFServiceGrpc.getGetPDFMethod) == null) {
      synchronized (PDFServiceGrpc.class) {
        if ((getGetPDFMethod = PDFServiceGrpc.getGetPDFMethod) == null) {
          PDFServiceGrpc.getGetPDFMethod = getGetPDFMethod =
              io.grpc.MethodDescriptor.<com.argus.pdf.v1.GetPDFRequest, com.argus.pdf.v1.GetPDFResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPDF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.argus.pdf.v1.GetPDFRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.argus.pdf.v1.GetPDFResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PDFServiceMethodDescriptorSupplier("GetPDF"))
              .build();
        }
      }
    }
    return getGetPDFMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PDFServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDFServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDFServiceStub>() {
        @java.lang.Override
        public PDFServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDFServiceStub(channel, callOptions);
        }
      };
    return PDFServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PDFServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDFServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDFServiceBlockingStub>() {
        @java.lang.Override
        public PDFServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDFServiceBlockingStub(channel, callOptions);
        }
      };
    return PDFServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PDFServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PDFServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PDFServiceFutureStub>() {
        @java.lang.Override
        public PDFServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PDFServiceFutureStub(channel, callOptions);
        }
      };
    return PDFServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  PDFのサービス
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * PDFを取得する
     * </pre>
     */
    default void getPDF(com.argus.pdf.v1.GetPDFRequest request,
        io.grpc.stub.StreamObserver<com.argus.pdf.v1.GetPDFResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPDFMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PDFService.
   * <pre>
   *  PDFのサービス
   * </pre>
   */
  public static abstract class PDFServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PDFServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PDFService.
   * <pre>
   *  PDFのサービス
   * </pre>
   */
  public static final class PDFServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PDFServiceStub> {
    private PDFServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDFServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDFServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * PDFを取得する
     * </pre>
     */
    public void getPDF(com.argus.pdf.v1.GetPDFRequest request,
        io.grpc.stub.StreamObserver<com.argus.pdf.v1.GetPDFResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPDFMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PDFService.
   * <pre>
   *  PDFのサービス
   * </pre>
   */
  public static final class PDFServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PDFServiceBlockingStub> {
    private PDFServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDFServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDFServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * PDFを取得する
     * </pre>
     */
    public com.argus.pdf.v1.GetPDFResponse getPDF(com.argus.pdf.v1.GetPDFRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPDFMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PDFService.
   * <pre>
   *  PDFのサービス
   * </pre>
   */
  public static final class PDFServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PDFServiceFutureStub> {
    private PDFServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PDFServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PDFServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * PDFを取得する
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.argus.pdf.v1.GetPDFResponse> getPDF(
        com.argus.pdf.v1.GetPDFRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPDFMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PDF = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PDF:
          serviceImpl.getPDF((com.argus.pdf.v1.GetPDFRequest) request,
              (io.grpc.stub.StreamObserver<com.argus.pdf.v1.GetPDFResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPDFMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.argus.pdf.v1.GetPDFRequest,
              com.argus.pdf.v1.GetPDFResponse>(
                service, METHODID_GET_PDF)))
        .build();
  }

  private static abstract class PDFServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PDFServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.argus.pdf.v1.PdfProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PDFService");
    }
  }

  private static final class PDFServiceFileDescriptorSupplier
      extends PDFServiceBaseDescriptorSupplier {
    PDFServiceFileDescriptorSupplier() {}
  }

  private static final class PDFServiceMethodDescriptorSupplier
      extends PDFServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PDFServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PDFServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PDFServiceFileDescriptorSupplier())
              .addMethod(getGetPDFMethod())
              .build();
        }
      }
    }
    return result;
  }
}
