package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rest = num%2;
        if (num == 0) {
            System.out.println("ноль");
        } else if ( num > 0 && rest == 0) {
            System.out.println("положительное четное число");
        } else if (num > 0 && rest != 0) {
            System.out.println("положительное нечетное число");
        } else if (num < 0 && rest == 0) {
            System.out.println("отрицательное четное число");
        } else System.out.println("отрицательное нечетное число");
        sc.close();
    }
}
