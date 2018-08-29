package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bignum = new int[20];
        int[] smallnum1 = new int[10];
        int[] smallnum2 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            bignum[i]  = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            smallnum1[i] = bignum[i];
        }
        for (int i = 10; i < 20; i++) {
            smallnum2[i-10] = bignum[i];
        }
        for (int i = 0; i < 10; i++) {
//            System.out.println(smallnum1[i]);
            System.out.println(smallnum2[i]);
        }
        //напишите тут ваш код
    }
}
