package de.telran.summary_2601.shape;

import java.util.List;

public class ShapeExample {

    public static void main(String[] args) {
        Shape point1 = new Point();
        Shape point2 = new Point();
        Shape point3 = new Point();

        Shape point4 = Shape.POINT;
        Shape point5 = Shape.POINT;

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 2, 3, 4);

        Shape square1 = new Square(5, 4);
        Shape square2 = new Square(5, 50);

        System.out.println(square1.equals(square2));
//        System.out.println(point1.equals(point2));
//        System.out.println(point4 == point5);

    }
}
