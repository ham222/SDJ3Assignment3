package via.sdj3.handin3.service;


import io.grpc.stub.StreamObserver;
import via.sdj3.handin3.GetAnimalsRegistrationNumbersPackageGrpc;
import via.sdj3.handin3.Package;
import via.sdj3.handin3.PackageId;


public class GetAnimalsRegistrationNumbersPackageImpl extends GetAnimalsRegistrationNumbersPackageGrpc.GetAnimalsRegistrationNumbersPackageImplBase {

    @Override
    public void Get(PackageId id, StreamObserver<Package> responseObserver){

    }
}
