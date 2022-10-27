package via.sdj3.grpcspringbootx.model;

import java.util.Date;

public class Animal {

    int id;
    private double weight;
    private Date dateDelivered;
    private String origin;

    public Animal(double weight, Date dateDelivered, String origin) {
        this.weight = weight;
        this.dateDelivered = dateDelivered;
        this.origin = origin;
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

    public Date getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(Date dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


}
