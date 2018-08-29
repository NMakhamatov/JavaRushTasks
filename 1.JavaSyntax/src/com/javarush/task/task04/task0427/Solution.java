package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String number = rd.readLine();
        int leng = number.length();
        int num = Integer.parseInt(number);
        int rest = num%2;
        if (num > 0 && num < 1000) {
            if (leng == 3 && rest == 0) {
                System.out.println("четное трехзначное число");
            } else if (leng == 3 && rest != 0) {
                System.out.println("нечетное трехзначное число");
            } else if (leng == 2 && rest == 0) {
                System.out.println("четное двузначное число");
            } else if (leng == 2 && rest !=0) {
                System.out.println("нечетное двузначное число");
            } else if (leng == 1 && rest == 0) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        }
        rd.close();


    }
}
