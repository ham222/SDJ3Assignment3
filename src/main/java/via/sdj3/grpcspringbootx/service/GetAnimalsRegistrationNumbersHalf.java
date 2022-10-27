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
    private HalfAnAnimalDAO dao = new HalfAnAnimalDAOImpl();

    // get the id of half animal
    int id ;

    // get the half an animal with the id
    via.sdj3.grpcspringbootx.model.HalfAnAnimal halfAnAnimal = dao.getHalfAnAnimalById(id);

    //get animalsParts from animal part
    ArrayList<AnimalPart> animalParts = halfAnAnimal.getParts();

    ArrayList<Integer> ids = new ArrayList<>();

    @Override
    public void get(HalfAnAnimalId halfAnAnimalId, StreamObserver<RegistrationNumbersForAnimal> halfAnAnimalStreamObserver){

        //It should be able to retrieve registration number for all animals
        //involved in a product

        System.out.println("Received request in GetAnimalsRegistrationNumbersHalf =>" + halfAnAnimalId.toString());

       id = halfAnAnimalId.getId();




        for (AnimalPart animalPart : animalParts){
            if(checkIfIdIsNotInList(animalPart.getAnimal().getId()))
            {
                ids.add(animalPart.getAnimal().getId());
            }
        }

        RegistrationNumbersForAnimal registrationNumbersForAnimal = RegistrationNumbersForAnimal.newBuilder().build();

                //build().get
        for (int id : ids) {
            registrationNumbersForAnimal.toBuilder().addIds(AnimalId.newBuilder().setId(id));
        }


        halfAnAnimalStreamObserver.onNext(registrationNumbersForAnimal);
        halfAnAnimalStreamObserver.onCompleted();



    }


    // checks if the ID of the Animal is not in list of ID's
    private boolean checkIfIdIsNotInList(int idToCheck)
    {
        for (int id: ids) {
            if(id == idToCheck)
            {
                return false;
            }
        }
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
