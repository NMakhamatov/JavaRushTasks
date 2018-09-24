package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(){}
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeBytes(firstName + "\n");
            out.writeBytes(lastName + "\n");
            out.writeInt(age);
            out.writeObject(children);
            out.flush();
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            setMother((Person)in.readObject());
            System.out.println("mother = " + mother +"\n");
//            mother = (Person)in.readObject();
            setFather((Person)in.readObject());
            System.out.println("father = " + father +"\n");

//            father = (Person)in.readObject();
            firstName = in.readLine();
            System.out.println("firstName = " + firstName + "\n");

            lastName = in.readLine();
            System.out.println("lastName = " + lastName + "\n");

            age = in.readInt();
            setChildren((List<Person>)in.readObject());
//            children = (List<Person>)in.readObject();
        }

        @Override
        public String toString() {
            return "name = " + firstName + "\n surname = " + lastName + "\n age = " + age + "\n mother = " + mother + "\n father = " + father
                    + "\n children = " + children;
        }
    }

    public static void main(String[] args)throws Exception {
        Person mother = new Person("mama","momi", 103);
        Person father = new Person("fatha", "Fathov",120);
        List<Person> list = new ArrayList<>();
        list.add(new Person("chidy", "fridy", 10));


        String file = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Person person = new Person("Name","SurName",88);
        person.setMother(mother);
        person.setFather(father);
        person.setChildren(list);

        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person readPerson = (Person)objectInputStream.readObject();
        System.out.println("==============PERSON=============\n" + person);
        System.out.println("==============READPERSON=============\n" + readPerson);
        objectOutputStream.close();
        objectInputStream.close();

    }
}
