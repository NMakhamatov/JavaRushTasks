package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Arrays;

/* 
Чётные и нечётные циферки
*/
//done
public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] letters = reader.readLine().split("");
        reader.close();
        Arrays.stream(letters).mapToInt(Integer::valueOf).forEach(i -> {
            if (i % 2 == 0) even++;
            else odd++;
        });
        System.out.println("Even: "+even + " Odd: " + odd);
    }
}
