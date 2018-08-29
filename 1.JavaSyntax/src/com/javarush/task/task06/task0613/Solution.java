package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static int catCount;
    public static void main(String[] args) {
        //создай 10 котов
        Cat[] cats = new Cat[10];
        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat();
        }
        System.out.println(Cat.catCount);

        //выведи значение переменной catCount
    }


    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;

        //создай конструктор
        public Cat() {
            catCount++;
        }
    }
}
