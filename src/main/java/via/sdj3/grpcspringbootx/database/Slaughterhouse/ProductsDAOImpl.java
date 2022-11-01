package via.sdj3.grpcspringbootx.database.Slaughterhouse;

import via.sdj3.grpcspringbootx.database.DatabaseFront;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.ProductsDAO;
import via.sdj3.grpcspringbootx.model.HalfAnAnimal;
import via.sdj3.grpcspringbootx.model.Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAOImpl implements ProductsDAO {

    DatabaseFront database = DatabaseFront.getInstance();
    @Override
    public List<String> getHalfAnimalFromAnimalId(int id) {
        Connection connection;
        ArrayList<String> ids = new ArrayList<>();
        try {
            connection = database.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "select distinct packageId from Package_has_Tray where trayId in (" +
                    "    select trayId from Tray_has_AnimalPart where animalPartId in (" +
                    "        select id from AnimalPart where animalId=?" +
                    "        )" +
                    "    );");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                ids.add(resultSet.getString("packageid"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ids;
    }

    @Override
    public List<String> getPackageFromAnimalId(int id) {
        Connection connection;
        ArrayList<String> ids = new ArrayList<>();
        try {
            connection = database.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "select distinct halfAnAnimalId from HalfAnAnimal_has_Tray where trayId in (" +
                            "    select trayId from Tray_has_AnimalPart where animalPartId in (" +
                            "        select id from AnimalPart where animalId=?" +
                            "        )" +
                            "    );");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                ids.add(resultSet.getString("halfananimalid"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ids;
    }
}
