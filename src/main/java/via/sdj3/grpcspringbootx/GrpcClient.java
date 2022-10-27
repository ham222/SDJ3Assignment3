package via.sdj3.grpcspringbootx;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.handin3.GetAnimalsRegistrationNumbersPackageGrpc;
import via.sdj3.handin3.PackageId;
import via.sdj3.handin3.RegistrationNumbersForAnimal;

import java.util.Scanner;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        GetAnimalsRegistrationNumbersPackageGrpc.GetAnimalsRegistrationNumbersPackageBlockingStub stub =
                GetAnimalsRegistrationNumbersPackageGrpc.newBlockingStub(channel);

        int text = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!(text < 0)) {
            text = keyboard.nextInt();
            RegistrationNumbersForAnimal response =
                    stub.get(PackageId.newBuilder().build());
            System.out.println(response);
        }

        channel.shutdown();
    }
}
