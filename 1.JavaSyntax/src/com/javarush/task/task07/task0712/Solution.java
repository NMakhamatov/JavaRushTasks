package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = r.readLine();
            list.add(s);
        }

        int maxi = 0;
        int mini = 0;
        int max = list.get(0).length();
        int min = max;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxi = i;
            }
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                mini = i;
            }
        }

        if (maxi < mini) {
            System.out.println(list.get(maxi));
        } else System.out.println(list.get(mini));
    }
}
