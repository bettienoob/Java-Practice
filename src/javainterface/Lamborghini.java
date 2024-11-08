package javainterface;

public class Lamborghini implements SportsCar, Automobile{
    private String make;
    private String model;
    private Double price;

    private float topSpeed;

    public Lamborghini(String model, Double price, float topSpeed){
        this.make = "Lamborghini";

        this.model = model;
        this.price = price;

        this.topSpeed = topSpeed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public float getTopSpeed(){
        return topSpeed;
    }

    @Override
    public String toString(){
        return String.format("Make: %s, Model: %s, Price: %s, Top speed: %1f",
                make, model, price, topSpeed);
    }
}
