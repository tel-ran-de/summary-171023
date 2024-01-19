package de.telran.summary;

public class CustomVehicle extends Vehicle {

    String type;

    public CustomVehicle(String vin,
                         String model,
                         String color,
                         int power,
                         int year,
                         String type) {
        super(vin, model, color, power, year);
        this.type = type;
    }
}
