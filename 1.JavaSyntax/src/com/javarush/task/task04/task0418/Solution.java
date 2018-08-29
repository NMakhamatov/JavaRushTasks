package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String a,b;
        a = rd.readLine();
        b = rd.readLine();
        int num1,num2, min;
        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        min = num1<num2 ? num1 : num2;
        if (num1==num2) {
            System.out.println(num1);
        } else
        System.out.println(min);
    }
}