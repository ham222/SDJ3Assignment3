package via.sdj3.grpcspringbootx.database.Slaughterhouse;

import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.HalfAnAnimalDAO;
import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.AnimalPart;
import via.sdj3.grpcspringbootx.model.HalfAnAnimal;
import via.sdj3.grpcspringbootx.model.Tray;
import via.sdj3.handin3.HalfAnAnimalId;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Date;

public class HalfAnAnimalDAOImpl implements HalfAnAnimalDAO {
    @Override
    public HalfAnAnimal getHalfAnAnimalById(int id) {
        //TODO implement database request


        // ONLY FOR TESTING
        // TODO DELETE AFTER DONE TESTING
        Animal animal1 = new Animal(23,new Date(2022,5,15), "Horsens");
        animal1.setId(1);
        Animal animal2 = new Animal(23,new Date(2022,5,16), "Horsens1");
        animal2.setId(2);
        Animal animal3 = new Animal(23,new Date(2022,5,15), "Horsens2");
        animal3.setId(3);

        AnimalPart part1 = new AnimalPart(1,2,"1", animal1);
        AnimalPart part2 = new AnimalPart(2,2,"1", animal1);

        AnimalPart part3 = new AnimalPart(3,2,"1", animal2);

        AnimalPart part4 = new AnimalPart(4,2,"1", animal3);
        AnimalPart part5 = new AnimalPart(5,2,"1", animal3);
        AnimalPart part6 = new AnimalPart(6,2,"1", animal3);

        ArrayList<AnimalPart> halfAnAnimalParts = new ArrayList<>();
        halfAnAnimalParts.add(part1);
        halfAnAnimalParts.add(part2);
        halfAnAnimalParts.add(part3);
        halfAnAnimalParts.add(part4);
        halfAnAnimalParts.add(part5);
        halfAnAnimalParts.add(part6);

        HalfAnAnimal halfAnAnimal = new HalfAnAnimal();
        halfAnAnimal.setParts(halfAnAnimalParts);

        return halfAnAnimal;
        // FINISH ONLY FOR TESTING


        //return null;
    }
}
