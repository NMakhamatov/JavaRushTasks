package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;//2
        char c =  (short)'d'; //100
        short s = (short) 2.22;//2
        int i = 150000;
        float f = (short) 0.50f;//0
        double result = f + (i / c) - (d * s) - (int)500e-3;
//        System.out.println(i/c);
//        System.out.println(f);
//        System.out.println(d);
        System.out.println("result: " + result);
    }
}