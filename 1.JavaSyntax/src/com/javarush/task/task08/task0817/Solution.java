package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Махаматов", "Нурсултан");
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
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        String[] names = new String[10];
        int i = 0;
        while (iter.hasNext()) {
            Map.Entry<String,String> pair = iter.next();
            String name = pair.getValue();
            names[i] = name;
            i++;
        }
        String[] dublnames = new String[10];
        for (int j = 0; j < 10; j++) {
            if (names[i]==null) return;
            String nam = names[i];

            for (int k = 0; k < 10; k++) {
                if (j!=k && nam.equals(names[k])) {
                    dublnames = nam;
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
