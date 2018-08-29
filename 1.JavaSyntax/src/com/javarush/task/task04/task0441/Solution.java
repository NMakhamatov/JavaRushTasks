package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a ==b && b==c) {
            System.out.println(a);
        } else if (a==b || b==c ) {
            System.out.println(b);
        }
        else if (a==c) {
            System.out.println(a);
        } else if (a>b && a<c) {
            System.out.println(a);
        }
        else if (b>c && b<c) {
            System.out.println(b);
        } else if (c>a && c<b)
            System.out.println(c);


        sc.close();
    }
}
