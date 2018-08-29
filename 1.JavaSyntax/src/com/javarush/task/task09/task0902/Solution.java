package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
//        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        //напишите тут ваш код
//        System.out.println( Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static String method2() {

        method3();
        //напишите тут ваш код
//        System.out.println( Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
//        System.out.println( Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
//        System.out.println( Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static String method5() {
        //напишите тут ваш код
        System.out.println( Thread.currentThread().get);
        return Thread.currentThread().getName();
    }
}
