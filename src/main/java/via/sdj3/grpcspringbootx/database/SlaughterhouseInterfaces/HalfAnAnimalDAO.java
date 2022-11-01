package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.HalfAnAnimal;

import java.util.ArrayList;

public interface HalfAnAnimalDAO {

    ArrayList<Animal> getAnimalsByHalfAnimalId(int id);
}
