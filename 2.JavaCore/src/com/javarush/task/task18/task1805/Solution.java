package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        Set<Integer> set = new TreeSet<>();
        int k = 0;
        while (fileInputStream.available()>0) {
            k = fileInputStream.read();
            set.add(k);
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
        scanner.close();
        fileInputStream.close();
    }
}
