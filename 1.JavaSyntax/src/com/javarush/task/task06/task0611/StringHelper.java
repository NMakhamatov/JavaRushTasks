package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.SchemaOutputResolver;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        result = multiply(s,5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result = result.concat(s);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Hello"));

    }
}
