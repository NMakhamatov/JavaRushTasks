package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine(),
                file2 = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(file1));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        String text = "";
        while (bufferedReader.ready()) {
            text = bufferedReader.readLine();
            text = text.replaceAll("\\p{P}||\\n","");
            bufferedWriter.write(text);
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
