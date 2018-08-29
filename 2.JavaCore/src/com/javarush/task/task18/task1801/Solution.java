package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Console console = System.console();
        String fileName = bufferedReader.readLine();
//        String fileName = console.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        bufferedReader.close();
        byte max = Byte.MIN_VALUE;
        while (fileInputStream.available() > 0) {
            byte b = (byte)fileInputStream.read();
            if (b>max) max = b;
//            System.out.println(b);
        }
        System.out.println(max);
        fileInputStream.close();
    }
}
