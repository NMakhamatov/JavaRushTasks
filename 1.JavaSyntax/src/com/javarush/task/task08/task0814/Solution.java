package com.javarush.task.task08.task0814;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        //напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> setnice = new HashSet<>();
        for (Integer i: set
             ) { if (i < 11) {
                 setnice.add(i);
        }

        }
        return setnice;

    }

    public static void main(String[] args) {
//        System.out.println(removeAllNumbersMoreThan10(createSet()));
//        HashSet<Integer> s = removeAllNumbersMoreThan10(createSet());
//        for (Integer i: s
//             ) {
//            System.out.println(i);
//        }
//
//    }
}}
