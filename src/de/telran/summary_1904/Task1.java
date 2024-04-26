package de.telran.summary_1904;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        int numOfThreads = 8;
        List<Thread> threads = new ArrayList<>();
        Map<Integer, List<Integer>> threadToList = new HashMap<>();
        for (int i = 0; i < numOfThreads; i++) {
            threadToList.put(i, new ArrayList<>());
        }
        int k = 10_000_000;

        long startTime = System.nanoTime();
        for (int i = 0; i < numOfThreads; i++) {

            final int finalI = i;
            Thread thread = new Thread(() -> {

                for (int j = 0; j < k; j++) {
                    threadToList.get(finalI).add(j);
                }
            });

            thread.start();
//            thread.join();

            threads.add(thread);
        }
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }

        long endTime = System.nanoTime();

        List<Integer> wholeNumbers = threadToList.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .toList();

//        System.out.println(wholeNumbers);
        System.out.println(wholeNumbers.size());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
    }
}
// Нужно создать N потоков, каждый из которых добавляет целые числа от (i * n) до ((i + 1) * n) в общий список
// Потоку main нужно дождаться завершения всех потоков и вывести вписок на экран.
