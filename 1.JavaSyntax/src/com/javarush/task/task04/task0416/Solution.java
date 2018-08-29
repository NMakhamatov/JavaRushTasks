package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Double d = sc.nextDouble();
        while (d >= 5) {
            d -=5;//напишите тут ваш код
        }
        if (d < 3) {
            System.out.println("зелёный");
        } else if (d < 4) {
            System.out.println("жёлтый");
        } else System.out.println("красный");
    }
}