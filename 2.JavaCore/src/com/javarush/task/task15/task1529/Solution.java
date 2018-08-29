package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.equals("helicopter")) result = new Helicopter();
        if (text.equals("plane")) result = new Plane(scanner.nextInt());
        scanner.close();
    }
}
