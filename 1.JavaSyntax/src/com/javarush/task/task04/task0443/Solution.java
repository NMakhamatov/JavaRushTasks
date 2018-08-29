package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        Scanner sc = new Scanner(System.in);

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String name = sc.readLine();
        int y,m,d;
        String s1, s2, s3;
        s1 = sc.readLine();
        s2 = sc.readLine();
        s3 = sc.readLine();
//        y = Integer.parseInt(s1);
//        m = Integer.parseInt(s2);
//        d = Integer.parseInt(s3);
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + s3.toString() + "." + s2.toString() + "." + s1.toString());
//        System.out.println(s2.toString());
    }
}
