package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        return rd.readLine();

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        return s.length() == 4;

    }

    public static void main(String[] args) {

    }
}
