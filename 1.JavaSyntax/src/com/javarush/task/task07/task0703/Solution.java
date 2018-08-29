package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s = new String[10];
        int[] num = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String str = r.readLine();
            s[i] = str;
        }
        for (int i = 0; i < 10; i++) {
            num[i] = s[i].length();
            System.out.println(num[i]);
        }
        //напишите тут ваш код
    }
}
