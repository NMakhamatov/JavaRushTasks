package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String s = r.readLine();
            list.add(s);
        }

        // Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s: result
             ) {
            System.out.println(s);

        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> resultt = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            resultt.add(list.get(i));
            resultt.add(list.get(i));
        }
        return resultt;
    }
}
