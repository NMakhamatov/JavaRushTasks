package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Задача по алгоритмам
*/
//done
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        reader.close();
        int maximum = list.stream().mapToInt(Integer::intValue).max().orElse(0);

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
