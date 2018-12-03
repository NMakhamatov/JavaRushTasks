package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
//done
public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static Set<Pair> set = new LinkedHashSet<>();

    public static void main(String[] args) throws Exception{
        String filePath = "";
        Scanner scanner = new Scanner(System.in);
        filePath = scanner.nextLine();
        scanner.close();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt"));
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> list1 = new ArrayList<>();

        String text = "";
        while (reader.ready()) {
            text = reader.readLine();
            String[] strings = text.split(" ");
            list1.addAll(Arrays.asList(strings));
//            System.out.println("==============");
//            System.out.println(list1);
//            System.out.println("==============");
        }
        for (int i = 0; i < list1.size()-1; i++) {
            String word1 = list1.get(i);
            for (int j = i+1; j < list1.size(); j++) {
                StringBuilder stringBuilder = new StringBuilder(list1.get(j));
                stringBuilder.reverse();
                if (word1.equals(stringBuilder.toString())) set.add(new Pair(word1,stringBuilder.reverse().toString()));

            }
        }
        reader.close();
        result.addAll(set);
//        result.forEach(pair -> {
//            System.out.println(pair.first+" - " + pair.second);
//        });
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
