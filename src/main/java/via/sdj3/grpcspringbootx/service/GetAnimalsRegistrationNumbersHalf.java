package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.database.Slaughterhouse.HalfAnAnimalDAOImpl;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.HalfAnAnimalDAO;
import via.sdj3.grpcspringbootx.model.AnimalPart;
import via.sdj3.handin3.*;

import java.net.Inet4Address;
import java.util.ArrayList;

@GRpcService
public class GetAnimalsRegistrationNumbersHalf extends GetAnimalsRegistrationNumbersHalfGrpc.GetAnimalsRegistrationNumbersHalfImplBase
{
    // get database
    private HalfAnAnimalDAO dao = new HalfAnAnimalDAOImpl();

    int id ;

    ArrayList<Integer> ids = new ArrayList<>();

    @Override
    public void get(HalfAnAnimalId halfAnAnimalId, StreamObserver<RegistrationNumbersForAnimal> halfAnAnimalStreamObserver){

        //It should be able to retrieve registration number for all animals
        //involved in a product

        System.out.println("Received request in GetAnimalsRegistrationNumbersHalf =>" + halfAnAnimalId.toString());


        // get the id of half animal
        id = halfAnAnimalId.getId();
        System.out.println("Got the ID " + id);

        // get the half an animal with the id
        via.sdj3.grpcspringbootx.model.HalfAnAnimal halfAnAnimal = dao.getHalfAnAnimalById(id);
        //get animalsParts from Half an Animal
        ArrayList<AnimalPart> animalParts = halfAnAnimal.getParts();




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




        halfAnAnimalStreamObserver.onNext(registrationNumbersForAnimal);
        halfAnAnimalStreamObserver.onCompleted();



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


    /*
    @Override
    public void toUpper(RequestText request, StreamObserver<ResponseText> responseObserver) {
        //super.toUpper(request, responseObserver);
        System.out.println("Received request: "+request);
        ResponseText text = ResponseText.newBuilder().setInputText(request.getInputText().toUpperCase()).build();
        responseObserver.onNext(text);
        responseObserver.onCompleted();
        System.out.println("Request: "+ request.getInputText().toUpperCase());
    } */

//    @Override
//    public void capitalizeFirstCharacter(RequestText request, StreamObserver<ResponseText> responseObserver) {
//        System.out.println("Received request: "+request);
//            this does stuff =>  ResponseText text = ResponseText.newBuilder().ngUtils.capsetInputText(Striitalize(request.getInputText())).build();
//        responseObserver.onNext(text);
//        responseObserver.onCompleted();
//        System.out.println("Request: "+ StringUtils.capitalize(request.getInputText()));
//    }

}
