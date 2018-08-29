package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println(number*2);//напишите тут ваш код
        } else if (number < 0) {
            System.out.println(++number);
        } else System.out.println(0);

    }

}