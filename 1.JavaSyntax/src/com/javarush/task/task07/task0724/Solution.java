package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human("Dima", true, 80);
        Human grandmother1 = new Human("Anya", false, 74);
        Human grandfather2 = new Human("Ded", true,82);
        Human grandmother2 = new Human("Bub", false, 77);
        Human father = new Human("Nursultan", true, 50, grandfather1, grandmother1);
        Human mother = new Human("Zhena", false, 45, grandfather2, grandmother2);
        Human sun = new Human("Manas", true, 23, father,mother);
        Human dauther1 = new Human("Eliza", false,21, father,mother);
        Human dauther2 = new Human("Anara", false, 17, father, mother);
        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(sun.toString());
        System.out.println(dauther1.toString());
        System.out.println(dauther2.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















