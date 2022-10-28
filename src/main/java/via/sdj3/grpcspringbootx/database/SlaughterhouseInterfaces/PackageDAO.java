package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.grpcspringbootx.model.Package;

public interface PackageDAO {

    Package getPackageById(int id);
}
