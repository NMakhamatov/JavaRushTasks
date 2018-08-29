package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)  {
        // напишите тут ваш код
        try {
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            scanner.close();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            ArrayList<Integer> integers = new ArrayList<>();
//            List<String> list = new ArrayList<>();
            String s;
            int i;
            while ((s = bufferedReader.readLine())!=null) {
               i = Integer.parseInt(s);
               if (i%2 == 0) integers.add(i);
            }
            Collections.sort(integers);
            for (Integer k : integers                 ) {
                System.out.println(k);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        catch (IOException e) {
            e.getStackTrace();
            System.out.println("IOException has been caught");
        }
    }
}
