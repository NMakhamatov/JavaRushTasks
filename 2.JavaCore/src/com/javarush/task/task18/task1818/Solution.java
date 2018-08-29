package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine(),
                file2 = scanner.nextLine(),
                file3 = scanner.nextLine();
        scanner.close();
        FileInputStream fileInputStream = new FileInputStream(file2);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        byte[] buffer = new byte[1000];
        while (fileInputStream.available()>0) {
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        fileInputStream.close();
        fileInputStream = new FileInputStream(file3);

        while (fileInputStream.available()>0) {
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
