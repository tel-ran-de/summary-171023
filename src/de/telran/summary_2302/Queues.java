package de.telran.summary_2302;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queues {

    public static void main(String[] args) {

        PriorityQueue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("Ermak", 2));
        queue.add(new Person("Yasevish", 2));
        queue.add(new Person("Ivanov", 1));
        queue.add(new Person("Krulov", 1));

        int n = 1; // 1..
        Iterator<Person> iterator = queue.iterator();
        while (--n > 0) {
            iterator.next();
        }
        Person nElement = iterator.next();
        System.out.println("nElement = " + nElement);

        while (!queue.isEmpty()) {
            Person elem = queue.poll();
            System.out.println("elem = " + elem);
        }
    }
}

