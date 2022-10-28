package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.database.Slaughterhouse.PackageDAOImpl;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.PackageDAO;
import via.sdj3.grpcspringbootx.model.AnimalPart;
import via.sdj3.grpcspringbootx.model.Package;
import via.sdj3.handin3.*;

import java.util.ArrayList;

@GRpcService
public class GetAnimalsRegistrationNumbersPackageImpl extends GetAnimalsRegistrationNumbersPackageGrpc.GetAnimalsRegistrationNumbersPackageImplBase {

    private PackageDAO dao = new PackageDAOImpl();
    private int id;
    private ArrayList<Integer> ids;
    //@Override
    public void get(PackageId packageId, StreamObserver<RegistrationNumbersForAnimal> packageStreamObserver){

        //It should be able to retrieve registration number for all animals
        //involved in a product


        System.out.println("Received request in GetAnimalsRegistrationNumbersHalf =>" + packageId.toString());
        ids = new ArrayList<>();

        // get the id of half animal
        id = packageId.getId();
        System.out.println("Got the ID " + id);

        // get the package animal with the id
        via.sdj3.grpcspringbootx.model.Package aPackage = dao.getPackageById(id);
        //get animalsParts from Half an Animal
        ArrayList<AnimalPart> animalParts = aPackage.getParts();




        // add all IDs into one list
        for (AnimalPart animalPart : animalParts){
            //check if the id is already in lsit
            if(checkIfIdIsNotInList(animalPart.getAnimal().getId()))
            {
                ids.add(animalPart.getAnimal().getId());
            }
        }

        // System.out.println("[" + ids.get(0) + ", " + ids.get(1)+ ", " + ids.get(2) + "]");
        ArrayList<AnimalId> animalIds = new ArrayList<>();

        // add all IDs into the GRPc Object AnimalID
        for (int id : ids) {
            animalIds.add(AnimalId.newBuilder().setId(id).build());
        }

        RegistrationNumbersForAnimal registrationNumbersForAnimal = RegistrationNumbersForAnimal.newBuilder().addAllIds(animalIds).build();




        packageStreamObserver.onNext(registrationNumbersForAnimal);
        packageStreamObserver.onCompleted();



    }


    // checks if the ID of the Animal is not in list of ID's
    private boolean checkIfIdIsNotInList(int idToCheck)
    {
        for (int id: ids) {
            if(id == idToCheck)
            {
                //System.out.println("id: " + idToCheck + " is in list" );
                return false;
            }
        }
        //System.out.println("id: " + idToCheck + " is not in list" );
        return true;
    }

}
