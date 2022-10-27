package via.sdj3.grpcspringbootx.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Package {

    private final String type;
    private final List<Tray> trays;
    private final Map<Integer, AnimalPart> parts;

    public Package(String type) {
        this.type = type;
        trays = new ArrayList<>();
        parts = new HashMap<>();
    }

    public String getType() {
        return type;
    }

    public List<Tray> getTrays() {
        return trays;
    }

    public int getPartsCount() {
        return parts.size();
    }
}
