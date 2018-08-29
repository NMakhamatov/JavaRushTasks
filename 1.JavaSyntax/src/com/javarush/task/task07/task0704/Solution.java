package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
        //напишите тут ваш код
    }
}

