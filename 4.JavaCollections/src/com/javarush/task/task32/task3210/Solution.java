package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/
//done

public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(args[0],"rw");
        String expectedText = args[2];
        int start = Integer.parseInt(args[1]);
        int length = expectedText.length();
        byte[] bytes = new byte[length];

        randomAccessFile.seek(start);
        randomAccessFile.read(bytes, 0, length);

        String actualText = new String(bytes);

        String equals = expectedText.equals(actualText) ? "true" : "false";

        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(equals.getBytes());
        randomAccessFile.close();
    }
}
