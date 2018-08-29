package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int to100, to4, to400;
        to100 = year % 100;
        to4 = year % 4;
        to400 = year % 400;
        if (to100 == 0 && to400 == 0) {
            System.out.println("количество дней в году: 366");//напишите тут ваш код
        } else if (to100 == 0 && to400 != 0) {
            System.out.println("количество дней в году: 365");
        } else if (to4 == 0) {
            System.out.println("количество дней в году: 366");
        } else System.out.println("количество дней в году: 365");
    }
}
