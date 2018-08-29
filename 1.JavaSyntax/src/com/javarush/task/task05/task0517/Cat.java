package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private String color;
    private String address;
    private int age;
    private int weight;

    public Cat(String name) {
        this.name = name;
        this.weight = 10;
        this.age = 3;
        this.color = "black";

    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
