package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception{
        TreeMap<Byte,Integer> map = new TreeMap<>();

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available()>0) {
            int c = fileInputStream.read();
            if (!map.containsKey((byte)c)) {
                map.put((byte)c,1);
            } else {
                int count = map.get((byte)c);
                map.put((byte)c,count+1);
            }
        }
        fileInputStream.close();
        for (Map.Entry<Byte,Integer> entry : map.entrySet()) {
            System.out.println((char)entry.getKey().intValue() + " " + entry.getValue());
        }
    }
}
