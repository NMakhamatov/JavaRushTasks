package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    private String name;
    private String color;
    private int height;

    public void initialize (String name) {
        this.name = name;
    }
    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
    }
    public void initialize (String name, int height, String color) {
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
