package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Числа по возрастанию
*/
//done
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(reader.readLine()));
        list.add(Integer.valueOf(reader.readLine()));
        list.add(Integer.valueOf(reader.readLine()));
        list.add(Integer.valueOf(reader.readLine()));
        list.add(Integer.valueOf(reader.readLine()));
        reader.close();

        list.stream().sorted().forEach(System.out::println);
        //напишите тут ваш код
    }
}
