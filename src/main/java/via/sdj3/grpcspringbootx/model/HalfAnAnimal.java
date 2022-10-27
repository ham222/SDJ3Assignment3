package via.sdj3.grpcspringbootx.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HalfAnAnimal
{
    
    private Map<Integer, AnimalPart> parts;
    List<Tray> trays;

    public HalfAnAnimal() {
        trays = new ArrayList<>();
        parts = new HashMap<>();
    }


    public Map<Integer, AnimalPart> getParts() {
        return parts;
    }

    public void setParts(Map<Integer, AnimalPart> parts) {
        this.parts = parts;
    }

    public List<Tray> getTrays() {
        return trays;
    }

    public void setTrays(List<Tray> trays) {
        this.trays = trays;
    }
}
