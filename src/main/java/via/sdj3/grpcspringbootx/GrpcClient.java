package via.sdj3.grpcspringbootx;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",6565)
                .usePlaintext()
                .build();

        /*TextConverterGrpc.TextConverterBlockingStub stub =
                TextConverterGrpc.newBlockingStub(channel);*/

        /*
            User input
         */

        /*String text = "";
        Scanner keyboard = new Scanner(System.in);
        while (!text.equals("quit")){
            text=keyboard.nextLine();
            ResponseText responseText = stub.toUpper(RequestText.newBuilder().setInputText(text).build());
            System.out.println(responseText);
        }*/
        channel.shutdown();
    }
}
