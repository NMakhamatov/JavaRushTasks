package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        //напишите тут ваш код
        while (true) {
            String s = reader.readLine();
            if ("end".equals(s)) {
                break;
            }
            list.add(s);
        }
        for (String s: list
             ) {
            System.out.println(s);

        }
    }
}