package de.telran.summary_0103;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

//        map.put("hello", "world");
        map.put("hello", "world2");

        String phrase = "world2";
        System.out.println("result = " + map.get(phrase));

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {

            }
        }

        List<Map.Entry<String, String>> entryList = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            entryList.add(entry);
        }

        System.out.println(entryList.get(0));
        for (int i = 0; i < entryList.size(); i++) {
            for (int j = i + 1; j < entryList.size(); j++) {

            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) { // entry pos = 3
            for (Map.Entry<String, String> innerEntry : map.entrySet()) { // innerEntry pos = 0

            }
            if (entry.getValue().equals(phrase)) {
                System.out.println("key = " + entry.getKey());
                break;
            }
        }

        map.compute("hello", (key, currentValue) -> {
            if (currentValue.equals("world2")) {
                return "replaced value";
            }
            return currentValue + " here"; // "world2 here"
        });

        String currentValue = map.get("hello");
        if (currentValue.equals("world2")) {
            map.put("hello", "replaced value");
        } else {
            map.put("hello", currentValue + " here");
        }

        System.out.println("Updated hello key = " + map.get("hello"));

        System.out.println("stream = " + Stream.of(1, 2, 3, -4)
                .filter(elem -> elem > 0)
                .map(elem -> elem * 2)
                .filter(elem -> elem > 4)
                .toList());

        // Дан массив чисел. Нужно отфильтровать их и вернуть список без дубликатов. Кроме того, вернуть ещё один список
        // где будут содержаться эти дубликаты.
        List<Integer> input = List.of(1, 3, 4, 3, 6, 1, 1);
        List<Integer> output1 = List.of(1, 3, 4, 6);
        List<Integer> output2 = List.of(3, 1, 1);

        // Дан набор измерений температуры, нужно посчитать какая температура встречалась реже всего и вывести три
        // самых частых значений.
        List.of(30, 29, 30, 28, 1, -20, -20);
        int lessFrequent = 1; // 1 или 28 или 19
        List<Integer> threeMostFrequent = List.of(30, -20, 1);

        // Документы
        // id=1. (раз, два три)
        // id=2. (ещё, какие-то данные, здесь)
        /*
            раз -> 1
            два -> 1
            три -> 1

            ещё -> 2
            какие-то данные -> 2
            здесь -> 2
         */

        // Нужно сгруппировать числа по десяткам. На вход данные положительные целые числа, после группировки нужно
        // 0..10 -> [2,4,5]
        // 11..20 -> [12,11,19]
        // Кроме этого, в результате в этой Map нужно сказать какая группа самая большая

    }
}
