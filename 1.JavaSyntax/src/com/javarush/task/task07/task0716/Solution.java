package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
Р или Л
*/
//done

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("мера");
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list.add("вода");
        list.add("упор");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }



    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> res = new ArrayList<>(list);

        Stream.iterate(0,i -> i + 1).limit(list.size()).forEach(i -> {
            boolean r=false,l=false;
            String[] letters = list.get(i).split("");
            for (int j = 0; j < letters.length; j++) {
                if (letters[j].equalsIgnoreCase("р")) r=true;
                if (letters[j].equalsIgnoreCase("л")) l=true;
            }
            if (r && !l) res.remove(list.get(i));
            if (!r && l) res.add(list.get(i));
        });
        return res;
    }
}