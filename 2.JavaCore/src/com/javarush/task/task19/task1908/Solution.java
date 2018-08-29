package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine(),
                file2 = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                try {
                    bufferedWriter.write((Integer.valueOf(word)).toString());
                    bufferedWriter.write(" ");
                } catch (NumberFormatException e) {

                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
