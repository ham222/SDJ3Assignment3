package via.sdj3.grpcspringbootx.database.Slaughterhouse;

import via.sdj3.grpcspringbootx.database.DatabaseFront;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.HalfAnAnimalDAO;
import via.sdj3.grpcspringbootx.model.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class HalfAnAnimalDAOImpl implements HalfAnAnimalDAO {
    DatabaseFront database = DatabaseFront.getInstance();

    @Override
    public ArrayList<Animal> getAnimalsByHalfAnimalId(int id) {
        Connection conn;
        ArrayList<Animal> animals = new ArrayList<>();
        try {
            conn = database.getConnection();
            PreparedStatement statement = conn.prepareStatement("select * from Animal where id in (" +
                    "select animalId from AnimalPart where id in (" +
                    "    select animalPartId from Tray_has_AnimalPart where trayId in (" +
                    "        select trayId from HalfAnAnimal_has_Tray where halfAnAnimalId=?" +
                    "        )" +
                    "    )" +
                    ");");
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int resultId = resultSet.getInt("id");
                double resultWeight = resultSet.getDouble("weight");
                String resultOrigin = resultSet.getString("origin");
                Animal a = new Animal(resultWeight, new Date(), resultOrigin);
                a.setId(resultId);
                animals.add(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animals;
    }
}
