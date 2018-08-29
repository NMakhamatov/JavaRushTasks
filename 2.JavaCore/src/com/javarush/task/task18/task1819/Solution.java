package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    static final int BUF_SIZE = 1024;
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine(),
                file2 = scanner.nextLine();
        scanner.close();

        ByteArrayOutputStream memory = new ByteArrayOutputStream();

        writeToMemory(memory,file2);
        writeToMemory(memory,file1);

        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        memory.writeTo(fileOutputStream);
        memory.close();
        fileOutputStream.close();
    }
    static void writeToMemory(ByteArrayOutputStream mem, String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        byte[] buf = new byte[BUF_SIZE];
        while (fileInputStream.available()>0) {
            int count = fileInputStream.read(buf);
            mem.write(buf,0,count);
        }
        fileInputStream.close();
    }
}
