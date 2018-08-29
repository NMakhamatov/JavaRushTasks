package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File(fileName) ;
        FileInputStream fileInputStream = new FileInputStream(file);

        while (true) {
            if (file.length() < 1000) break;
             fileName = scanner.nextLine();
             file = new File(fileName);
             fileInputStream = new FileInputStream(file);

        }
        scanner.close();
        fileInputStream.close();
        throw new DownloadException();

    }
    public static class DownloadException extends Exception {

    }
}
