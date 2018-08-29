package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        s1 = reader.readLine();
        s2 = reader.readLine();
        //напишите тут ваш код
        if (s1.equals(s2)) {
            System.out.println("Имена идентичны");
        }
        if (s1.length() == s2.length() && !s1.equals(s2)) {
            System.out.println("Длины имен равны");
        }
    }
}

