package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;
        while (fileInputStream.available()>0) {
            if (fileInputStream.read() == ',') count++;
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
