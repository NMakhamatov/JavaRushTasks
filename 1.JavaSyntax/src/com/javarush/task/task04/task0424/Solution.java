package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }//напишите тут ваш код
        boolean b01, b12, b02;
        b01 = false;
        b02 = false;
        b12 = false;

        if (a[1]==a[0] ) {
            b01=true;
        }
        if (a[1] == a[2]) {
            b12 = true;
        }
        if (a[0] == a[2]) {
            b02 = true;
        }
        if (b01 && !b02) {
            System.out.println(3);
        } else if (b12 && !b02) {
            System.out.println(1);
        } else if (b02 && !b12) {
            System.out.println(2);
        }
    }
}
