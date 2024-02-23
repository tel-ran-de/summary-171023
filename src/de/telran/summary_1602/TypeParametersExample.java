package de.telran.summary_1602;

import java.util.*;

public class TypeParametersExample {

    public static void main(String[] args) {
        Set<Integer> set = process(List.of(1, 2, 3));

        Set<Object> set2 = process2(List.of("one", "two", "three"));
        Object firstElem = set2.iterator().next();

        byte a = (byte) 1 + 2;
        processByte(a);
        processByte((byte) 100);

//        NumbersList<Integer> list = new NumbersList<>();
//        list.add(1);
//        list.sum();

//        FancyIntegerList list = new FancyIntegerList();
//        list.add(123);
//        Integer a = list.get(index);
//        Iterator<Integer> it = list.iterator();
        // Iterator<Integer> vs Iterable<Integer>

//        Arrays.copyOfRan

        Iterable<Integer> integers = List.of(1, 2, 3);
        Iterator<Integer> it1 = integers.iterator();
        Iterator<Integer> it2 = integers.iterator();
//        for (Integer i : integers) {
//        }
//        Set<String> set2 = new HashSet<>();

        System.out.printf("firstElem = %s", firstElem);
    }

    public static void processByte(byte a) {
        System.out.println(a);
    }

    public static <T> Set<T> process(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
        return Set.copyOf(list);
    }

    public static Set<Object> process2(List<Object> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
        return Set.of(1, 2, 3);
    }

    public static void linkedListExample() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Iterator<Integer> iterator = linkedList.iterator();
        iterator.next();
        iterator.remove();

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(12);
        arrayDeque.push(50);
        arrayDeque.iterator();

        // ArrayList, HashSet, TreeSet, HashMap, TreeMap
        // [1,5,3,4,2], 5
        // Map<Integer, Integer>
        // i, j => 2, 4
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(50);
        Queue<Integer> queue = new LinkedList<>();
//        arrayDeque.ad
    }

    public int[] getSumIndexes(int[] arr, int sum) {
        return new int[]{0, 2};
    }

    public static void enumSetExample() {
        Set<TransportType> set = EnumSet.noneOf(TransportType.class);
//        Set<TransportType> set = new HashSet<>();
        set.add(TransportType.BIKE);

        if (set.contains(TransportType.CAR)) {
            System.out.println("CAR is in Set");
        }
    }
}

enum TransportType {
    AIRPLANE,
    CAR,
    BIKE
}
