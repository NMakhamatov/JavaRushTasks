package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x!=0 && y!=0) {
            if (x>0 && y>0) {
                System.out.println(1);
            } else if (x>0 && y < 0) {
                System.out.println(4);
            } else if (x < 0 && y < 0) {
                System.out.println(3);
            } else System.out.println(2);
        }
        sc.close();
    }
}
