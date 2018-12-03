package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
//done
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));
    }
    public static String [] getTokens(String query, String delimiter) {
        if (query == null)return new String[0];
        StringTokenizer stringTokenizer = new StringTokenizer(query,delimiter);
        String[] res = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stringTokenizer.nextToken();
        }
        return res;
    }
}
