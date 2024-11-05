package Generics;

public class Car {
    public String make;
    public String model;
    public Double price;

    public Car(String make, String model, Double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }
}
