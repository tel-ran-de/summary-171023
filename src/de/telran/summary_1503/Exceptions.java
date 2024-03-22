package de.telran.summary_1503;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

    public static void main(String[] args) {
//        Reader someContent = new InMemoryReader(Map.of("input.txt", "Some content"));

//        someContent.readText("input.txt");

        throw new RuntimeException("Something went wrong");

//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = openFile("input.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(fileInputStream);
//        try {
//            new FileInputStream("input.txt").read();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    private static FileInputStream openFile(String fileName) throws FileNotFoundException {
        try {
            return new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
