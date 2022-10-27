/*
package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.util.StringUtils;
import via.sdj3.grpcspringbootx.protobuf.RequestText;
import via.sdj3.grpcspringbootx.protobuf.ResponseText;
import via.sdj3.grpcspringbootx.protobuf.TextConverterGrpc;

@GRpcService
public class TextConverterImpl extends TextConverterGrpc.TextConverterImplBase {

    @Override
    public void toUpper(RequestText request, StreamObserver<ResponseText> responseObserver) {
        //super.toUpper(request, responseObserver);
        System.out.println("Received request: "+request);
        ResponseText text = ResponseText.newBuilder().setInputText(request.getInputText().toUpperCase()).build();
        responseObserver.onNext(text);
        responseObserver.onCompleted();
        System.out.println("Request: "+ request.getInputText().toUpperCase());
    }

    @Override
    public void capitalizeFirstCharacter(RequestText request, StreamObserver<ResponseText> responseObserver) {
        System.out.println("Received request: "+request);
        ResponseText text = ResponseText.newBuilder().setInputText(StringUtils.capitalize(request.getInputText())).build();
        responseObserver.onNext(text);
        responseObserver.onCompleted();
        System.out.println("Request: "+ StringUtils.capitalize(request.getInputText()));
    }
}
*/
