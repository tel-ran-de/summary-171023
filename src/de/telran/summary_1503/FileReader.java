package de.telran.summary_1503;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader implements Reader {

    @Override
    public String readText(String source) throws IOException {
        return new String(new FileInputStream(source).readAllBytes());
    }
}
