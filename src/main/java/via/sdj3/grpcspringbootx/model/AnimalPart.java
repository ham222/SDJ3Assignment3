package via.sdj3.grpcspringbootx.model;

public class AnimalPart {

    private int id;
    private double weight;
    public String type;
    private Animal animal;

    public AnimalPart(int id, double weight, String type, Animal animal) {
        this.id = id;
        this.weight = weight;
        this.type = type;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


}
