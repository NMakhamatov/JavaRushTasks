package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        int a,b,c;
        int p =0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > 0) {
            p++;
        }
        if (b > 0) {
            p++;
        }
        if (c > 0) {
            p++;
        }
        System.out.println(p);
        sc.close();
    }
}
