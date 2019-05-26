package com.javarush.task.task35.task3509;

import java.util.*;


/* 
Collections & Generics
*/
//done
public class Solution {

    public static void main(String[] args) {
        System.out.println(newArrayList("one", "two", "three"));
        System.out.println(Arrays.toString(new String[]{"one", "two", "three"}));
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишите тут ваш код
        ArrayList<T> list = new ArrayList<>(elements.length);

        list.addAll(Arrays.asList(elements));

        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишите тут ваш код
        HashSet<T> set = new HashSet<T>(elements.length);
        set.addAll(Arrays.asList(elements));
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        //напишите тут ваш код
        if (keys.size() != values.size()) throw new IllegalArgumentException();

        HashMap<K, V> map = new HashMap<>(keys.size());

        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
