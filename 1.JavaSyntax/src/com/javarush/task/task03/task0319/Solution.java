package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s1 = reader.readLine();
       String s2 = reader.readLine();
       String s3 = reader.readLine();
       int i2 = Integer.parseInt(s2);
       int i3 = Integer.parseInt(s3);
       System.out.println(s1 + " получает " + i2 + " через " + i3 + " лет.");
       //напишите тут ваш код
    }
}
