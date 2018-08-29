package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Norris", new Date("JANUARY 4 1980"));
        map.put("Chan", new Date("February 5 1980"));
        map.put("Li", new Date("March 20 1980"));
        map.put("Travolta", new Date("April 17 1980"));
        map.put("Depp", new Date("May 2 1980"));
        map.put("Pitt", new Date("July 28 1980"));
        map.put("Joli", new Date("August 13 1980"));
        map.put("Putin", new Date("November 22 1980"));
        map.put("Obama", new Date("December 11 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();
            Date d = pair.getValue();
            if (d.getMonth() > 4 && d.getMonth() < 8) {
                iter.remove();
            }
        }
        //напишите тут ваш код


    }

    public static void main(String[] args) {
//        HashMap<String,Date> map = createMap();
//        System.out.println(map);
//        removeAllSummerPeople(map);
//        System.out.println(map);

    }
}
