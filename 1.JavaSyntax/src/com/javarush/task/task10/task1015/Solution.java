package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> [] arrayLists = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                arrayLists[i].add("" + i + " ");
            }

        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}