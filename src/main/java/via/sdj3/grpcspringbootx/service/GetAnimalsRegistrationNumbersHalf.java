package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.database.Slaughterhouse.HalfAnAnimalDAOImpl;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.HalfAnAnimalDAO;
import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.handin3.AnimalId;
import via.sdj3.handin3.GetAnimalsRegistrationNumbersHalfGrpc;
import via.sdj3.handin3.HalfAnAnimalId;
import via.sdj3.handin3.RegistrationNumbersForAnimal;

import java.util.ArrayList;

@GRpcService
public class GetAnimalsRegistrationNumbersHalf extends GetAnimalsRegistrationNumbersHalfGrpc.GetAnimalsRegistrationNumbersHalfImplBase {
    int id;
    ArrayList<Integer> ids = new ArrayList<>();
    // get database
    private final HalfAnAnimalDAO dao = new HalfAnAnimalDAOImpl();

    @Override
    public void get(HalfAnAnimalId halfAnAnimalId, StreamObserver<RegistrationNumbersForAnimal> halfAnAnimalStreamObserver) {

        //It should be able to retrieve registration number for all animals
        //involved in a product
        id = halfAnAnimalId.getId();
        ArrayList<Animal> animals = dao.getAnimalsByHalfAnimalId(id);
        System.out.println(animals.get(0).getId());
        ArrayList<AnimalId> animalIds = new ArrayList<>();

        // add all IDs into the GRPc Object AnimalID
        for (int i = 0; i < animals.size(); i++) {
            animalIds.add(AnimalId.newBuilder().setId(animals.get(i).getId()).build());
        }

        RegistrationNumbersForAnimal registrationNumbersForAnimal = RegistrationNumbersForAnimal.newBuilder().addAllIds(animalIds).build();


        halfAnAnimalStreamObserver.onNext(registrationNumbersForAnimal);
        halfAnAnimalStreamObserver.onCompleted();


    }
}
