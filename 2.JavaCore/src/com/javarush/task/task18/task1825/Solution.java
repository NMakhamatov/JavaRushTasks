package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        String fileName;
        while (!(fileName = scanner.nextLine()).equals("end")) {
            set.add(fileName);
        } scanner.close();
        Map<Integer,String> map = new TreeMap<>();
        int index = 0;
        String fileOut = "";
        for (String s : set) {
            if (index == 0 ) {
                index = s.lastIndexOf("part");
                fileOut = s.substring(0,index-1);
            }
            map.put(Integer.parseInt(s.substring(index+4)),s);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
        FileInputStream fileInputStream;
//        String text = "c://users/file.avi.part";
//        System.out.println(text.substring(0,19));
        int BUFFER_SIZE = 1024;
        byte[] buffer = new byte[BUFFER_SIZE];
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            fileInputStream = new FileInputStream(entry.getValue());
            while (fileInputStream.available()>0) {
                int count = fileInputStream.read(buffer);
                fileOutputStream.write(buffer,0,count);
            }
            fileInputStream.close();

        }
        fileOutputStream.close();
    }
}
