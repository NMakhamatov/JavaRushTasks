package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/
//done
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("man1",54,"Google");
        Man man2 = new Man("man2", 78, "Yandex");
        Woman w1 = new Woman("w1", 898,"kjk");
        Woman w2 = new Woman("w2",123, "nju");

        String format = "%s %d %s";
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);


    }

    //напишите тут ваш код
    public static class Man{
        String name;
        String address;
        int age;

        public Man(String name,  int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman{
        String name;
        String address;
        int age;

        public Woman(String name, int age , String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
}
