package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception{
        //implement this method - реализуйте этот метод
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
        fileInputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        PrintWriter printWriter = new PrintWriter(outputStream);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            if (entry.getKey().startsWith("!") || entry.getKey().startsWith("#")) {
                continue;
            } else {
                String[] keys = entry.getKey().split("[^.]");
                    if (keys.length == 1) {
                        printWriter.print(keys[0]);
                    } else {

                    }
            }
        }
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) throws Exception{
        Solution.properties.put("Hello there mazafaka","i am fine");
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
    }
}
