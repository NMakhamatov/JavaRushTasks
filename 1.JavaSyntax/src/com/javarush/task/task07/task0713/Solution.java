package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listrest = new ArrayList<>();
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 20; i++) {
            if (list.get(i)%3 == 0) {
                list3.add(list.get(i));
            }
            if (list.get(i)%2 == 0) {
                list2.add(list.get(i));
            }
            if (list.get(i)%3 != 0 && list.get(i)%2 != 0) {
                listrest.add(list.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(listrest);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int num: list) {
            System.out.println(num);
        }
    }
}
