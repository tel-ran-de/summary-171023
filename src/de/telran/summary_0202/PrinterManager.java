package de.telran.summary_0202;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PrinterManager {

    private static PrinterManager instance;
    private final RandomAccessFile printerHandle;

    public static PrinterManager create() {
//        return new PrinterManager();
        if (instance != null) {
            return instance;
        }
        try {
            instance = new PrinterManager();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return instance;
    }

    private PrinterManager() throws FileNotFoundException {
        printerHandle = new RandomAccessFile("/dev/printer1", "w+");
    }

    public void print(String content) throws IOException {
        printerHandle.write(content.getBytes());
    }
}
