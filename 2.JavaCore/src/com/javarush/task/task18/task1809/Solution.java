package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] fileName = solution.readFileNames();
        solution.file1ToFile2(fileName[0],fileName[1]);
    }
    private String[] readFileNames() {
        Scanner scanner = new Scanner(System.in);
        String[] fileName = new String[2];
        for (int i = 0; i<fileName.length; i++) {
            fileName[i] = scanner.nextLine();
        }
        scanner.close();
        return fileName;
    }
    private void file1ToFile2(String fileName1, String fileName2) {
        try {
            List<Integer> list = new ArrayList<>();
            FileInputStream fileInputStream = new FileInputStream(fileName1);
            while (fileInputStream.available()>0) {
                list.add(fileInputStream.read());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
            ListIterator<Integer> iterator = list.listIterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            while (iterator.hasPrevious()) {
                fileOutputStream.write(iterator.previous());
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
