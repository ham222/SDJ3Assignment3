package via.sdj3.grpcspringbootx.model;

import java.util.ArrayList;
import java.util.List;

public class HalfAnAnimal {

    List<Tray> trays;
    private ArrayList<AnimalPart> parts;

    public HalfAnAnimal() {
        trays = new ArrayList<>();
        parts = new ArrayList<>();
    }


    public ArrayList<AnimalPart> getParts() {
        return parts;
    }

    public void setParts(ArrayList<AnimalPart> parts) {
        this.parts = parts;
    }

    public List<Tray> getTrays() {
        return trays;
    }

    public void setTrays(List<Tray> trays) {
        this.trays = trays;
    }
}
