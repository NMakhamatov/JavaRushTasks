package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "";
        while (!(file = scanner.nextLine()).equals("exit")) {
            new ReadThread(file).start();
        }
        scanner.close();


//        for (Map.Entry<String,Integer> entry : resultMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private Map<Integer,Integer> map = new HashMap<>();

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available()>0) {
                    Integer character = fileInputStream.read();
                    if (!map.containsKey(character) ){
                        map.put(character,1);
                    } else {
                        int count = map.get(character);
                        map.put(character,count+1);
                    }
                }
                int resultKey = -1;
                int resultCount = -1;
                for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                    if (entry.getValue()>resultCount) {
                        resultKey = entry.getKey();
                        resultCount = entry.getValue();
                    }
                }
                resultMap.put(fileName,resultKey);
                fileInputStream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
