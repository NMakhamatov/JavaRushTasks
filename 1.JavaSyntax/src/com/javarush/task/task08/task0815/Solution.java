package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Махаматов ", "Нурсултан");
        map.put("Петров", "Павел");
        map.put("Гаршин", "Павел");
        map.put("Блинов", "Павел");
        map.put("Казачкова", "Павел");
        map.put("Пикалов", "Антон");
        map.put("Перов", "Николай");
        map.put("Белов", "Иван");
        map.put("Туратов", "Бакыт");
        map.put("Седовласов", "Максим");

        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> iter = map.entrySet().iterator();
        int count = 0;


        while (iter.hasNext()) {
            HashMap.Entry<String,String> pair = iter.next();
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> iter = map.entrySet().iterator();
        int count = 0;


        while (iter.hasNext()) {
            HashMap.Entry<String,String> pair = iter.next();
            String key = pair.getKey();
            if (lastName.equals(key)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
