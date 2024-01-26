package de.telran.summary_2601;

public class EqualInteger {

    public static void main(String[] args) {

        Integer a = 5;
        Integer b = 5;

        System.out.println("5 == 5: ");
        System.out.println(a == b);

        Integer c = 500;
        Integer d = 500;

        System.out.println("500 == 500: ");
        System.out.println(c == d);

        String aStr = new String("abc");
        String bStr = new String("abc");

        System.out.println("aStr == bStr : ");
        System.out.println(aStr == bStr);


    }
}
