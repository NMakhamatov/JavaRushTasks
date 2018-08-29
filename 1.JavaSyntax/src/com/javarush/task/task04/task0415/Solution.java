package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();//напишите тут ваш код
        b = sc.nextInt();//напишите тут ваш код
        c = sc.nextInt();
        boolean ch1, ch2, ch3;
        ch1 = (a+b)>c;//напишите тут ваш код
        ch2 = (b+c)>a;//напишите тут ваш код
        ch3 = (a+c)>b;
        if (ch1 && ch2 && ch3) {
            System.out.println("Треугольник существует.");//напишите тут ваш код
        } else System.out.println("Треугольник не существует.");
    }
}