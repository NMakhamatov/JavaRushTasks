package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        int[] a = new int[3];
        a[0] = sc.nextInt();//напишите тут ваш код
        a[1] = sc.nextInt();//напишите тут ваш код
        a[2] = sc.nextInt();//напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i]>a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
