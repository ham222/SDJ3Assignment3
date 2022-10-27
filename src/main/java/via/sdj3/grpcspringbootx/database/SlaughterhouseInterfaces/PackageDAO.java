package via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces;

import via.sdj3.handin3.Package;
import via.sdj3.handin3.PackageId;

public interface PackageDAO {

    Package getPackageById(int id);
}
