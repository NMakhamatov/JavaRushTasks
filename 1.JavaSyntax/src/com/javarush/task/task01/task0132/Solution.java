package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       int num1 = (int) number/100;
//       System.out.println(num1);
       int num2 = number%100;
       num2 = (int) num2/10;
//       System.out.println(num2);
       int num3 = number%10;
//       System.out.println(num3);
       return num1 + num2 + num3;

       //напишите тут ваш код
    }
}
