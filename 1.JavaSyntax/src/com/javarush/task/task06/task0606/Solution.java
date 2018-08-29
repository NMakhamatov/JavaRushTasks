package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
//        Scanner sc = new Scanner(System.in);
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        char[] ch = new char[s.length()];
        int[] rest = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            rest[i] = Integer.parseInt(ch[i]);
        }
        int num = Integer.parseInt(s);
        int jk = Integer.parseInt();
        for (int i=1; i <= leng; i++) {
            int rest = num%(10^i);
            rest = rest%2;
            if (rest == 0) {
                Solution.even++;
            } else Solution.odd++;
        }
        rd.close();
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
