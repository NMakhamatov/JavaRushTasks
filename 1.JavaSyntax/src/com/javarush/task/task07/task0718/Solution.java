package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* 
Проверка на упорядоченность
*/
//done
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        reader.close();

        List<String> sortedList = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        for (int i = 0; i < 10; i++) {
            if (!sortedList.get(i).equals(list.get(i))) {
                System.out.println(list.indexOf(sortedList.get(i)));
                break;
            }
        }
    }
}

