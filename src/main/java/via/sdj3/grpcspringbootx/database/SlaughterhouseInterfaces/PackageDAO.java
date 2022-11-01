package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.grpcspringbootx.model.Animal;
import via.sdj3.grpcspringbootx.model.Package;

import java.util.ArrayList;

public interface PackageDAO {

    ArrayList<Animal> getAnimalsByPackgeId(int id);
}
