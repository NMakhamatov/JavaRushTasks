package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
//todo доделать
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (!(telNumber.startsWith("+") && telNumber.matches("\\+\\d{12}"))) return false;
        else if (telNumber.matches("^(\\d,\\().*")){}
        else if (!telNumber.matches(".*\\d$")) return false; //должен заканчиваться на цифру
        else if (!(telNumber.matches("[a-zA-Z]"))) return false; //должен не содержать букв
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));//true
//        System.out.println(checkTelNumber("80501234567"));
    }
}
