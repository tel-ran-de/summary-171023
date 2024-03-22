package de.telran.summary_1503;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        var result = List.of(1, 2, 3, 4, 5)
                .stream()
                .map(elem -> elem * 2)
                .filter(elem -> elem % 2 == 0)
                .collect(Collectors.toList()); // O(n) * m, m - количество операторов

        System.out.println(result);

        var iterateStreamResult = Stream.iterate(0, prev -> prev + 1)
                .limit(200)
                .collect(Collectors.toList());

        System.out.println("iterate stream = " + iterateStreamResult);

        var flatmapResult = List.of(1, 2, 3).stream() // Stream<Integer>
                .flatMap(elem -> List.of(elem, elem, elem, elem).stream()) // Stream<Integer>
                .collect(Collectors.toList());

        System.out.println("flatmapResult result = " + flatmapResult);

        var list = List.of(1, 2, 3, 4, 5);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer elem : list) {
            min = Math.min(min, elem);
            max = Math.max(max, elem);
        }
        System.out.println("Max = " + max + ", min = " + min);

        OptionalInt maxOpt = list.stream().mapToInt(i -> i).max();
        OptionalInt minOpt = list.stream()
                .mapToInt(i -> i).min();


        ReduceResult reduceResult1 = list.stream()
                .reduce(new ReduceResult(Integer.MIN_VALUE, Integer.MAX_VALUE),
                        (reduceResult, integer) -> new ReduceResult(Math.max(reduceResult.max, integer), Math.min(reduceResult.min, integer)),
                        (reduceResult, reduceResult2) -> new ReduceResult(Math.max(reduceResult.max, reduceResult2.max),
                                Math.min(reduceResult.min, reduceResult2.min)));

        System.out.println("Reduce result = " + reduceResult1);

//        ToIntFunction<Number> mapperNumber = null;
//        ToIntFunction<? super Integer> mapperInteger = null;
////        mapperNumber = mapperInteger;
//        mapperInteger = mapperNumber;

        List<? extends Number> a = null;
        List<Integer> b = null;

        a = b;

        Number[] aNumber = null;
        Integer[] bNumber = null;

        aNumber = bNumber;

        // Дан список чисел, вам нужно отфильтровать только положительные числа и в результате создать Хеш таблице, где
        // исходное число будет помещено в ключ, а значением будет это же число умноженное на 5
    }
}

class ReduceResult {
    int max;
    int min;

    public ReduceResult(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public String toString() {
        return "ReduceResult{" +
                "max=" + max +
                ", min=" + min +
                '}';
    }
}
