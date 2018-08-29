package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
                if (j == n-1) {
                    if (i != m-1) {
                        System.out.print("\n");
                    }
                }
            }
//            System.out.println("\n");
        }
        sc.close();

    }
}
