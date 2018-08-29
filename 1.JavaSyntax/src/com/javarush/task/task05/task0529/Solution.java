package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = rd.readLine();
            int i = 0;
            if ("сумма".equals(s)) {
                break;
            } else {
                i = Integer.parseInt(s);
                sum += i;
            }
        }
        rd.close();
        System.out.println(sum);
    }
}
