package via.sdj3.handin3.model;

public class Tray
{
    private double maxWeight;

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

    private String type;

    public Tray(double maxWeight, String type)
    {
        this.maxWeight = maxWeight;
        this.type = type;
    }


}
