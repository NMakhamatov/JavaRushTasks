package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> index = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String s = r.readLine();
            strings.add(s);
        }
        int min = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
            }
        }
//        for (int i = 0; i < index.size(); i++) {
//
//            System.out.println(strings.get(index.get(i)));
//        }
        r.close();
        //напишите тут ваш код
    }
}
