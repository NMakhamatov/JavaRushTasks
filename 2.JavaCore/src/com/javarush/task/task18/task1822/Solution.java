package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws  Exception {
//        Scanner scanner = new Scanner(System.in);
//        String file = scanner.nextLine();
//        scanner.close();
        String file = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String id = args[0];
        List<Integer> list = new ArrayList<>();
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                try {
                    Double.parseDouble(words[i]);
                    list.add(i+1);
                } catch (Exception e) {

                }
            }
            for (int i = 0; i<words.length;i++) {
                if (id.equals(words[i]) && !list.contains(i)){
                    while (!list.contains(i)) {
                        System.out.print(words[i]);
                        System.out.print(" ");
                        i++;
                    }
                    System.out.print(words[i]);
                }
            }
        }
        bufferedReader.close();
    }
}
