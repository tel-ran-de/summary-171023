package de.telran.summary_2302;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {
        List<Person> people = new java.util.ArrayList<>(List.of(
                new Person("Ermak", 2),
                new Person("Yasevish", 2),
                new Person("Ivanov", 1),
                new Person("Krulov", 1)
        ));
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -(o1.department - o2.department);
            }
        });
        int[] integers = {5, 3, 1};
        Arrays.sort(integers);

        System.out.println(people);
        System.out.println(Arrays.toString(integers));
    }
}

class Person implements Comparable<Person> {
    String lastName;
    int department;

    public Person(String lastName, int department) {
        this.lastName = lastName;
        this.department = department;
        String str = "sd123l";
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return -(department - o.department);
    }
}

