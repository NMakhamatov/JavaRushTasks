package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        scanner.close();
//        String url = "http://javarush.ru/alpha/index.html?obj=3.17774&obj=6.78g";
        String[] parameteres = url.split("\\?");
        parameteres = parameteres[1].split("&");
        List<String> values = new ArrayList<>();

        for (int i = 0; i < parameteres.length; i++) {
            if (parameteres[i].contains("=")) {
                System.out.print(parameteres[i].substring(0,parameteres[i].indexOf("=")) + " ");
                if (parameteres[i].contains("obj")) {
                    values.add(parameteres[i].substring(parameteres[i].indexOf("=")+1,parameteres[i].length()));
//                parameteres[i] = parameteres[i].substring(0,parameteres[i].indexOf("="));
                }
            } else System.out.print(parameteres[i] + " ");

//            System.out.print(parameteres[i] + " ");
        }
        System.out.println();
//        for (String s : values) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
        distrib(values);
    }
    public static void distrib(List<String> ss) {
        for (String s : ss) {
            try {
//                if (s.contains(".")) {
                double d = Double.parseDouble(s);
                alert(d);
//                else alert(s);
            } catch (NumberFormatException e) {
                alert(s);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
