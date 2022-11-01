package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.grpcspringbootx.model.HalfAnAnimal;
import via.sdj3.grpcspringbootx.model.Package;

import java.util.List;

public interface ProductsDAO {
    List<String> getHalfAnimalFromAnimalId(int id);
    List<String> getPackageFromAnimalId(int id);
}
