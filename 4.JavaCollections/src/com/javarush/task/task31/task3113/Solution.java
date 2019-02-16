package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

/* 
Что внутри папки?
*/
//done
public class Solution {
public static int totalFolders = -1;
static int totalFiles = 0;
static long totalSize = 0;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        String fileName = "C:\\Users\\Nursultan\\Desktop\\Java\\IO";
//        String fileName = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\test\\b.txt";
        String fileName = scanner.nextLine();
        scanner.close();
        Path path = Paths.get(fileName);
        if (!Files.isDirectory(path)) {
            System.out.println(path.toString() + " - не папка");
        } else {
            Files.walkFileTree(path,new MyFileVisitor());
            System.out.println("Всего папок - " + totalFolders);
            System.out.println("Всего файлов - " + totalFiles);
            System.out.println("Общий размер - " + totalSize);
        }

    }
}
