package de.telran.summary;

public abstract class Vehicle {

    String vin;
    String model;
    String color;
    int power;
    int year;

    public Vehicle(String vin,
                   String model,
                   String color,
                   int power,
                   int year) {
        this.vin = vin;
        this.model = model;
        this.color = color;
        this.power = power;
        this.year = year;
    }

    static void countBlackVehicles(Vehicle[] vehicles) {
        int blackVehicles = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.color.equals("Black")) {
                blackVehicles++;
            }
        }
        System.out.println("Black vehicles = " + blackVehicles);
    }

}
