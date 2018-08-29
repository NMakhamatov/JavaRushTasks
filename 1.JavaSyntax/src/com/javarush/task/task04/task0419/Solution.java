package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        int max1, max2, max;
        max1 = Math.max(arr[0],arr[1]);
        max2 = Math.max(arr[2],arr[3]);
        max = Math.max(max1, max2);
        if (arr[0]== arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
            System.out.println(arr[1]);
        } else System.out.println(max);
    }
}
