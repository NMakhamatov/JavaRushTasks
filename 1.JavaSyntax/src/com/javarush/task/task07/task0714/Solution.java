package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Слова в обратном порядке
*/
//done

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());

        list.remove(2);
        for (int i = 3; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


