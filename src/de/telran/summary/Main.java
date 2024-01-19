package de.telran.summary;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("removal")
public class Main {

    public static void main(String[] args) {
//        Main main = new Main();
        int a = 1;
        double c = 0.1;

        // эквивалент
        Integer b = 2;
        Integer d = new Integer(2);
        Integer d1 = new Integer(3);
        Integer d2 = new Integer(4);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        Person anton = new Person("Anton", 31, 186, 81);
//        anton.name = "Anton";
//        anton.age = 31;

        Person ivan = new Person("Ivan", 35, 190, 80);
//        ivan.name = "Ivan";
//        ivan.age = 35;

        Person vasya = new Person("Vasya", 40, 170, 81);

//        System.out.println(anton.name);
//        System.out.println(ivan.name);

        Car fordCar = new Car("123",
                "Ford",
                "Black",
                180,
                2005,
                "sedan",
                4);

        Motocycle hondaBike = new Motocycle("234",
                "Honda",
                "Black",
                150,
                2020,
                "bike");

        countBlackVehicles(new Vehicle[]{fordCar, hondaBike});
    }

    private static void countBlackVehicles(Vehicle[] vehicles) {
        int blackVehicles = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.color.equals("Black")) {
                blackVehicles++;
            }
        }
        System.out.println("Black vehicles = " + blackVehicles);
    }
}
