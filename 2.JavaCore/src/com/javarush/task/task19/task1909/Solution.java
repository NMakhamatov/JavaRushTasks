package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine(),
                file2 = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        while (bufferedReader.ready()) {
            String text = bufferedReader.readLine();
            text = text.replaceAll("\\.","!");
            writer.write(text);
        }
        bufferedReader.close();
        writer.close();
    }
}
