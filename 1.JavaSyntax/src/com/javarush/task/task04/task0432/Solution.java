package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        String q = rd.readLine();
        int i = Integer.parseInt(q);
        while (i > 0) {
            System.out.println(s);
            i--;
        }
        rd.close();

    }
}
