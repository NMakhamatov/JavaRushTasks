package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private double weight;
        private int height;
        private BigDecimal salary;
        private String name;
        private boolean married;

        public Human() {
            this.age = 25;
            name = "John";

        }
        public Human (String name,int age) {
            this.name = name;
            this.age = age;
        }
        public Human (String name,int age,double weight) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public Human (String name, int age, boolean married) {
            this.age = age;
            this.name = name;
            this.married = married;
        }
        public Human (String name,int age,boolean married, BigDecimal salary) {
            this.name = name;
            this.age = age;
            this.married = married;
            this.salary = salary;
        }
        public Human (String name,int age,boolean married, BigDecimal salary, double weight) {
            this.name=name;
            this.age=age;
            this.salary=salary;
            this.married=married;
            this.weight=weight;
        }
        public Human (String name,int age,boolean married, BigDecimal salary, double weight, int height) {
            this.name=name;
            this.age=age;
            this.salary=salary;
            this.married=married;
            this.weight=weight;
            this.height = height;
        }
        public Human (double weight) {
            this.weight = weight;
        }
        public Human (double weight, int age) {
            this.weight = weight;
            this.age = age;
        }public Human (double weight, int age,BigDecimal salary) {
            this.weight = weight;
            this.age = age;
            this.salary=salary;
        }
    }
}
