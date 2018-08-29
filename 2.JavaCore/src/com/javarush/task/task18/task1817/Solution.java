package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        int count = 0;
        int whitespaces = 0;
        while (bufferedReader.ready()) {
            String text = bufferedReader.readLine();
            char[] chars = text.toCharArray();
            count += chars.length;
            for (char c : chars) {
                if (c == ' ') whitespaces++;
            }
        }
        bufferedReader.close();
        double ratio = 100D*whitespaces/count;
        BigDecimal bigDecimal = new BigDecimal(ratio);
        bigDecimal = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        System.out.println(bigDecimal);
    }
}
