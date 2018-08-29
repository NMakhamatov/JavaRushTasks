package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        Map<Integer,Integer> map = new HashMap<>();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int k = 0;
        while (fileInputStream.available()>0) {
            k = fileInputStream.read();
            if (!map.containsKey(k)) map.put(k,1);
            else {
                int temp = map.get(k);
                map.remove(k);
                map.put(k,temp + 1);
            }
        }
        fileInputStream.close();
        Collection<Integer> collectionInt = map.values();
        List<Integer> list = new ArrayList<>();
        int max = Collections.max(collectionInt);

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
