package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* 
Формируем WHERE
*/
//done
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        params.entrySet().stream().filter(set -> set.getValue()!=null).forEach(set -> builder
                .append(set.getKey())
                .append(" = '")
                .append(set.getValue())
                .append("'")
                .append(" and "));
        if (builder.length()==0) return "";
        builder.delete(builder.length() - 5,builder.length());
        return builder.toString();
    }
}
