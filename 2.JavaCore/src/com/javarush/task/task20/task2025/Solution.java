package com.javarush.task.task20.task2025;

import java.util.Arrays;
import java.util.stream.LongStream;

/*
Алгоритмы-числа
*/
//работает, но долго
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = LongStream.iterate(1L,i -> i+1).limit(N-1).filter(num -> {
            int M = String.valueOf(num).length();
            String number = String.valueOf(num);
            long sum = Arrays.stream(number.split(""))
                    .map(Long::valueOf)
                    .mapToLong(i -> (long)Math.pow(i,M))
                    .sum();
            return Double.compare(sum,num)==0;
        }).toArray();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumbers(999999L)));
    }
}
