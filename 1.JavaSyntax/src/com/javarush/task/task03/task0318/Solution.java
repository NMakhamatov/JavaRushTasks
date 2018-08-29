package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String years = reader.readLine();
        String name = reader.readLine();
        int ye = Integer.parseInt(years);
        System.out.println(name + " захватит мир через " + ye + " лет. Му-ха-ха!" );
    }
}
