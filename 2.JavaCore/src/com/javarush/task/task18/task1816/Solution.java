package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        int count = 0;
        while (bufferedReader.ready()) {
            String text = bufferedReader.readLine();
            char[] letters = text.toCharArray();
            for (char c : letters) {
                if ('a'<=c && c<='z' || 'A'<=c && c<='Z') count++;
            }
        }
        bufferedReader.close();
        System.out.println(count);
    }
}
