package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine(),
                file2 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        for (int i = 0; fileReader.ready() ; i++) {
            if ((i%2)!= 0){
            fileWriter.write(fileReader.read());}
            else fileReader.read();
        }
        fileReader.close();
        fileWriter.close();
    }
}
