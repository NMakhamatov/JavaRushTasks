package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] fileName = solution.readFileNames();
        List<Integer> list = solution.fileToList(fileName[0]);
        int size = list.size();
        int k = (size%2 == 0 ? size/2:size/2+1);
        solution.listToFile(list,0,k,fileName[1]);
        solution.listToFile(list,k,size,fileName[2]);

    }


    private String[] readFileNames() {
        Scanner scanner = new Scanner(System.in);
        String[] fileName = new String[3];
        for (int i = 0; i<3; i++) {
            fileName[i] = scanner.nextLine();
        }
        scanner.close();
        return fileName;
    }
    private List<Integer> fileToList(String fileName) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
        return list;
    }
    private void listToFile(List<Integer> list,int start, int end,String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            for (int i = start; i < end; i++) {
                fileOutputStream.write(list.get(i));
            }
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException in listToFile() method");
            e.printStackTrace();
        }
    }
}
