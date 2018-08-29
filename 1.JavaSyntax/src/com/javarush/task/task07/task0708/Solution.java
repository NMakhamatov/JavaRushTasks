package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> index = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String s = r.readLine();
            strings.add(s);
        }
        int max = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max) {
                index.add(i);
            }
        }

        for (int i = 0; i < index.size(); i++) {

            System.out.println(strings.get(index.get(i)));
        }
        //напишите тут ваш код
    }
}
