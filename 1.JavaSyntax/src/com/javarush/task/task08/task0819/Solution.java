package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();


        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()) {
            if ("Vasya".equals(iter.next().name)) {
                iter.remove();
            }
        }


        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }
    public static class Cat {
        String name;
        public Cat(String s) {
            this.name = s;
        }

    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat("Vasya"));
        set.add(new Cat("Pushok"));
        set.add(new Cat("Tornado"));

        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c: cats
             ) {
            System.out.println(c);

        }
    }

    // step 1 - пункт 1
}
