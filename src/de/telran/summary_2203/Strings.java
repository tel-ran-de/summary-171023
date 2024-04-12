package de.telran.summary_2203;

import java.util.Properties;

public class Strings {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties.get("myarg"));
        char ch = 'a'; // 2 bytes -> 2 ^ 16 -> 65536
        String abc = "Hello world";
        String greenHeart = "\uD83D\uDC9A"; // UTF-16
        // UTF-32

        char[] chars = greenHeart.toCharArray();


        System.out.println("Length = " + greenHeart.length() + " greenHeart = " + greenHeart + ", chars length = " + chars.length);

        String password = "\uD83D\uDC9A\uD83D\uDC9A\uD83D\uDC9A";

        int codePointCount = password.codePointCount(0, password.length());
        if (codePointCount < 6) {
            System.out.println("Password is too short, codePointCount = " + codePointCount);
        } else {
            System.out.println("Password is OK, password = " + password);
        }

        String str = getString();
//        System.out.println(str.length());
    }

    private static String getString() {
        Object flag = System.getProperties().get("return_null");
        if (flag != null && flag.equals("true")) {
            return null;
        }
        return "abc";
    }
}
