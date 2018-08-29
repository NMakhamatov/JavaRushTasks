package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        int a, b, c;
        int p = 0;
        int otr = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
            if (a > 0) {
                p++;
            } else if (a < 0){
                otr++;
            }
            if (b > 0) {
                p++;
            } else if (b < 0) {
                otr++;
            }
            if (c > 0) {
                p++;
            } else if (c < 0){
                otr++;
            }
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + p);
        sc.close();

    }
}
