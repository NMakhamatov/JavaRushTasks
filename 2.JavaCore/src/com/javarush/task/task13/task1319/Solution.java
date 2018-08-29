package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(line));
        line = br.readLine();
//        bufferedWriter.write(line);
//        System.out.println("hello");
//        line = br.readLine();
        while (!line.equals("exit")) {
            bufferedWriter.write(line );
//            bufferedWriter.write("\n");
            bufferedWriter.newLine();
            line = br.readLine();
            if (line.equals("exit")) {
                bufferedWriter.write(line);
            }
        }
        br.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
