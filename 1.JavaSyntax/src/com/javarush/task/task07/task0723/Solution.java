package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution  {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
//            Thread.sleep(100);
            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch ( InterruptedException e ) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Бум!");
    }
}
