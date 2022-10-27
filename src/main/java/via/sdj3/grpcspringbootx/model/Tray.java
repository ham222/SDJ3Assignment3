package via.sdj3.grpcspringbootx.model;

public class Tray {
    private double maxWeight;
    private String type;

    public Tray(double maxWeight, String type) {
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
