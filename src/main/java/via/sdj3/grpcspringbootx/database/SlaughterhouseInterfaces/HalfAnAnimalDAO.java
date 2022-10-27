package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.grpcspringbootx.model.HalfAnAnimal;
import via.sdj3.handin3.HalfAnAnimalId;

public interface HalfAnAnimalDAO {

    HalfAnAnimal getHalfAnAnimalById(int id);
}
