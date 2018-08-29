package com.javarush.task.task18.task1802;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int min = Integer.MAX_VALUE;
        while (fileInputStream.available() > 0 ) {
            int k = fileInputStream.read();
            if (k<min) min = k;
        }
        System.out.print(min);
        scanner.close();
        fileInputStream.close();
    }
}
