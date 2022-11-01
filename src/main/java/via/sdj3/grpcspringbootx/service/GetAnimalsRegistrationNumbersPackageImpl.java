package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.database.Slaughterhouse.PackageDAOImpl;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.PackageDAO;
import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.handin3.AnimalId;
import via.sdj3.handin3.GetAnimalsRegistrationNumbersPackageGrpc;
import via.sdj3.handin3.PackageId;
import via.sdj3.handin3.RegistrationNumbersForAnimal;

import java.util.ArrayList;

@GRpcService
public class GetAnimalsRegistrationNumbersPackageImpl extends GetAnimalsRegistrationNumbersPackageGrpc.GetAnimalsRegistrationNumbersPackageImplBase {

    private final PackageDAO dao = new PackageDAOImpl();
    private int id;

    @Override
    public void get(PackageId packageId, StreamObserver<RegistrationNumbersForAnimal> packageStreamObserver) {

        //It should be able to retrieve registration number for all animals
        //involved in a product

        // get the package animal with the id
        id = packageId.getId();
        ArrayList<Animal> animals = dao.getAnimalsByPackgeId(id);
        System.out.println(animals.get(0).getId());
        ArrayList<AnimalId> animalIds = new ArrayList<>();

//        // add all IDs into the GRPc Object AnimalID
        for (int i = 0; i < animals.size(); i++) {
            animalIds.add(AnimalId.newBuilder().setId(animals.get(i).getId()).build());
        }
        RegistrationNumbersForAnimal registrationNumbersForAnimal = RegistrationNumbersForAnimal.newBuilder().addAllIds(animalIds).build();


        packageStreamObserver.onNext(registrationNumbersForAnimal);
        packageStreamObserver.onCompleted();


    }

}
