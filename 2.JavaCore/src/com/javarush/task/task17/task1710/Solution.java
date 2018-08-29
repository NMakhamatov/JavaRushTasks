package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
//        System.out.println("Before:");
//        for (Person p : allPeople) {
//            System.out.println(p);
//        }
        switch (args[0]) {
            case "-c": {
                int id = allPeople.size();
                if (!("м".equals(args[2])) && !("ж".equals(args[2]))) throw new RuntimeException("the SEX is wrong");
                else {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
                    try {
                        Date date = sdf.parse(args[3]);
                        if ("м".equals(args[2])) allPeople.add(Person.createMale(args[1],date));
                        else allPeople.add(Person.createFemale(args[1],date));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                } System.out.println(id);
                break;
            }case "-u": {
                int id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);

                person.setName(args[2]);
                person.setSex("м".equals(args[2])? Sex.MALE:Sex.FEMALE);

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
                try {
                    Date date = simpleDateFormat.parse(args[4]);
                    person.setBirthDay(date);
                } catch (ParseException e ) {
                    System.out.println("Wrong BirthDay!");
                    e.printStackTrace();
                }
                break;
            }case "-i" : {
                int id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);

                String sex;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                if (Sex.MALE.equals(person.getSex())) sex = "м";
                else sex = "ж";

                System.out.println(person.getName() + " " + sex + " " + simpleDateFormat.format(person.getBirthDay()));
                break;
            }case "-d" : {
                int id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);

                person.setBirthDay(null);
                person.setName(null);
                person.setSex(null);
            }
        }
//        System.out.println("------------------------------------------------");
//        System.out.println("After: ");
//        for (Person p : allPeople) {
//            System.out.println(p);
//        }
    }
}
