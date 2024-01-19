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

        System.out.println(anton.name);
        System.out.println(ivan.name);
    }
}
