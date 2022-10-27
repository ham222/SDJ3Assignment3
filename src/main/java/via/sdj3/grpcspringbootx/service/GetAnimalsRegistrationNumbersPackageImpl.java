package via.sdj3.grpcspringbootx.service;

import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.handin3.GetAnimalsRegistrationNumbersPackageGrpc;
import via.sdj3.handin3.HalfAnAnimalId;
import via.sdj3.handin3.Package;
import via.sdj3.handin3.PackageId;

@GRpcService
public class GetAnimalsRegistrationNumbersPackageImpl extends GetAnimalsRegistrationNumbersPackageGrpc.GetAnimalsRegistrationNumbersPackageImplBase {

    //@Override
    public Package get(HalfAnAnimalId halfAnAnimalId){
        return null;
    }

}
