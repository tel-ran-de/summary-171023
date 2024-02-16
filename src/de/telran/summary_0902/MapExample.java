package de.telran.summary_0902;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(43);
        list.add(5);
        list.add(-1);
//        list.add("2398");
        System.out.printf("List = %s\n", list);
        System.out.printf("List.get(1) = %s\n", list.get(1));

        Map<Integer, String> map = new HashMap<>();

        map.put(5, "123");
        map.put(4, "dslkjsdfkj");
        map.put(4, "56_replace");
        map.put(3, "28392389");
        map.put(100, "Anton");

        System.out.printf("Map.get(4) = %s\n", map.get(4));

        Map<String, List<Double>> map2 = new HashMap<>();

        map2.put("Anton", List.of(1.2, 5.3));
        map2.put("Nastya", List.of((double) 5, 3.2)); // O(1)

        map2.put(null, List.of(5.2)); // O(1)

        System.out.printf("map2.get(\"Anton\") = %s\n", map2.get("Anton"));

        System.out.printf("map2.get(null) = %s\n", map2.get(null)); // ~O(1)
        System.out.printf("map2.get(\"vvvv\") = %s\n", map2.get("vvvv"));

        for (Map.Entry<String, List<Double>> entry : map2.entrySet()) { // O(n), n - количество элементов
            System.out.printf("map2: Key = %s, value = %s\n", entry.getKey(), entry.getValue());
        }

        Map<Person, String> map3 = new HashMap<>();

        map3.put(new Person("Anton", "Ermak"), "Teacher");


        // Inverted Index
        String text = "Я живу в Берлине";
        int documentId = 1;

        String text2 = "Я живу в Бангкоке";
        int documentId2 = 2;

        Map<String, List<Integer>> invertedIndex = new HashMap<>();

        invertedIndex.put("я", List.of(1, 2));
        invertedIndex.put("живу", List.of(1, 2));
        invertedIndex.put("в", List.of(1, 2));
        invertedIndex.put("берлине", List.of(1));
        invertedIndex.put("банкоке", List.of(2));

        String query = "я банкоке";
        // я -> [1,2]
        // банкоке -> [2]
        // ответ: 2


    }
}

class Person {

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
