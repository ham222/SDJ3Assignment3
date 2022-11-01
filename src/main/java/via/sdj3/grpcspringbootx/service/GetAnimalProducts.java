package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.grpcspringbootx.database.Slaughterhouse.ProductsDAOImpl;
import via.sdj3.grpcspringbootx.database.SlaughterhouseInterfaces.ProductsDAO;
import via.sdj3.grpcspringbootx.model.HalfAnAnimal;
import via.sdj3.grpcspringbootx.model.Package;
import via.sdj3.handin3.*;

import java.util.ArrayList;

@GRpcService
public class GetAnimalProducts extends GetAnimalProductsGrpc.GetAnimalProductsImplBase {

    private final ProductsDAO dao = new ProductsDAOImpl();

    @Override
    public void get(AnimalId animalId, StreamObserver<AnimalProducts> animalStreamObserver)
    {

        int id = animalId.getId();

        ArrayList<String> packages = (ArrayList<String>) dao.getPackageFromAnimalId(id);
        ArrayList<String> halfAnimals = (ArrayList<String>) dao.getHalfAnimalFromAnimalId(id);

        ArrayList<PackageId> packageIds = new ArrayList<>();
        ArrayList<HalfAnAnimalId> halfAnAnimalIds = new ArrayList<>();


        for (int i = 0 ; i <packages.size() ; i++) {
            packageIds.add(PackageId.newBuilder().setId(Integer.parseInt(packages.get(i))).build());
        }
        for (int i = 0 ; i <halfAnimals.size() ; i++) {
            halfAnAnimalIds.add(HalfAnAnimalId.newBuilder().setId(Integer.parseInt(halfAnimals.get(i))).build());
        }

        AnimalProducts animalProducts = AnimalProducts.newBuilder().addAllHalfAnAnimalId(halfAnAnimalIds).addAllPackageId(packageIds).build();

        animalStreamObserver.onNext(animalProducts);
        animalStreamObserver.onCompleted();



    }
}
