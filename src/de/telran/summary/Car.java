package de.telran.summary;

public class Car extends Vehicle {

    String bodyType;
    int doors;

    public Car(String vin,
               String model,
               String color,
               int power,
               int year,
               String bodyType,
               int doors) {
        super(vin, model, color, power, year);
        this.bodyType = bodyType;
        this.doors = doors;
    }
}
