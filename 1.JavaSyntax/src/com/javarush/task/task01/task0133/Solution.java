package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
       int sec = seconds;
       while (sec>=3600) {
           sec -= 3600;//напишите тут ваш код
       }
       return sec;
    }
}