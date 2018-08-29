package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();//напишите тут ваш код
        b = sc.nextInt();//напишите тут ваш код
        c = sc.nextInt();//напишите тут ваш код
        if (a==b && b==c) {
            System.out.println(a + " " +a + " " + a);
        } else if (a==b) {
            System.out.println(a + " " + a);
        } else if (b == c ) {
            System.out.println(b + " " +b);
        } else if (a==c) {
            System.out.println(a + " " + a);
        }
    }
}