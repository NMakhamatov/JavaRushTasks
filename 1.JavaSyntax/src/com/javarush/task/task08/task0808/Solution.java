package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
10 тысяч удалений и вставок
Дополнительно было добавлено измерение времени выполнения каждой операции
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        System.out.println("ArrayList: \n");
        ArrayList arrayList = new ArrayList();

        System.out.print("insert: ");
        insert10000(arrayList);

        System.out.print("get: ");
        get10000(arrayList);

        System.out.print("set: ");
        set10000(arrayList);

        System.out.print("remove: ");
        remove10000(arrayList);

        // LinkedList
        System.out.println("\n LinkedList:");
        LinkedList linkedList = new LinkedList();

        System.out.print("insert: ");
        insert10000(linkedList);

        System.out.print("get: ");
        get10000(linkedList);

        System.out.print("set: ");
        set10000(linkedList);

        System.out.print("remove: ");
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        Date date1 = new Date();
        long time1 = date1.getTime();
        for (int i=0; i < 10000; i++) {
            list.add(new Object());
        }
        Date date2 = new Date();
        long time2 = date2.getTime();

        long time = time2 - time1;
        System.out.println(time);

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        Date date1 = new Date();
        long time1 = date1.getTime();

        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }

        Date date2 = new Date();
        long time2 = date2.getTime();

        long time = time2 - time1;
        System.out.println(time);

    }

    public static void set10000(List list) {
        //напишите тут ваш код
        Date date1 = new Date();
        long time1 = date1.getTime();

        for (int i = 0; i < 10000; i++) {

            list.set(i, new Object());
        }

        Date date2 = new Date();
        long time2 = date2.getTime();

        long time = time2 - time1;
        System.out.println(time);

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        Date date1 = new Date();
        long time1 = date1.getTime();

        for (int i = 0; i < 10000; i++) {
            list.remove(10000 - i -1);
        }

        Date date2 = new Date();
        long time2 = date2.getTime();

        long time = time2 - time1;
        System.out.println(time);

    }
}
