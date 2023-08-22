package com.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class nais {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("src//a.txt");
        fileOutputStream.write(98);
        fileOutputStream.close();
    }
}
