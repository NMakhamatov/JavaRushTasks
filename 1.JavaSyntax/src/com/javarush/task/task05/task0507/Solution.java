package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double aver = 0;
        int sum = 0;
        int i = 0;
        while (sc.hasNextInt()) {
            int t = 0;
            t = sc.nextInt();

                if (t != -1) {
                    sum += t;
                    i++;//напишите тут ваш код
                } else break;


        }
        aver = (double)sum/i;
//        System.out.println(sum);
        System.out.println(aver);
    }
}

