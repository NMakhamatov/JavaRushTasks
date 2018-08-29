package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(bufferedReader.readLine());
            int num2 = Integer.parseInt(bufferedReader.readLine());
            bufferedReader.close();

            if (num1 <= 0 || num2 <= 0) throw new NumberFormatException();

//        int num1 = 7,num2 = 10;

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            nod(num1,2,list1);
            nod(num2,2,list2);

            int commonDiv = commonDiv(list1,list2);
            System.out.println(commonDiv);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

    }
    private static void nod(int num, int i, List<Integer> list) {
        if (num == 1) return;
        else if (num % i == 0) {
            list.add(i);
            nod(num/i, 2,list);
        } else {
            nod(num,++i,list);
        }
    }
    private static int commonDiv(List<Integer> list1, List<Integer> list2) {
        int res = 1;
        for (Integer i : list1) {
            if (list2.contains(i)) {
                res *= i;
                list2.remove(i);
            }
        }
        return res;
    }
}
