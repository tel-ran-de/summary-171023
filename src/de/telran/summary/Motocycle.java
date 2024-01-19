package de.telran.summary;

public class Motocycle extends Vehicle {

    String bikeType;

    public Motocycle(String vin,
                     String model,
                     String color,
                     int power,
                     int year,
                     String bikeType) {
        super(vin, model, color, power, year);
        this.bikeType = bikeType;
    }
}
