package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("exit")) {
            if (text.contains(".")) {
                 try {
                     Double d = Double.parseDouble(text);
                     print(d);
                 } catch (NumberFormatException e) {
                     print(text);
                 }

            } else {
                try {
                    int i = Integer.parseInt(text);
                    if (i > 0 && i < 128) print((short)i);
                    else print(i);
                } catch (NumberFormatException e) {
                    print(text);
                }
            }
            text = scanner.nextLine();
        }
        scanner.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
