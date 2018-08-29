package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    int id = allPeople.size();
                    int count = (args.length-1)/3;
                    for (int i = 0; i<count; i++) {
                        if (!("м".equals(args[2+3*i])) && !("ж".equals(args[2+3*i]))) throw new RuntimeException("the SEX is wrong");
                        else {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
                            try {
                                Date date = sdf.parse(args[3+3*i]);
                                if ("м".equals(args[2+3*i])) allPeople.add(Person.createMale(args[1+3*i],date));
                                else allPeople.add(Person.createFemale(args[1+3*i],date));
                                System.out.println((id+i));
//                                System.out.print(" ");
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }

                        }

                    }
                    break;
                }
            }case "-u": {
                synchronized (allPeople) {
                    int count = (args.length-1)/4;
                    for (int i = 0; i < count; i++) {
                        int id = Integer.parseInt(args[1+4*i]);
                        Person person = allPeople.get(id);

                        person.setName(args[2+4*i]);
                        person.setSex("м".equals(args[3+4*i])? Sex.MALE:Sex.FEMALE);

                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
                        try {
                            Date date = simpleDateFormat.parse(args[4+4*i]);
                            person.setBirthDay(date);
                        } catch (ParseException e ) {
                            System.out.println("Wrong BirthDay!");
                            e.printStackTrace();
                        }
                    }
                    break;
                }
            }case "-i" : {
                synchronized (allPeople) {
                    int count = args.length-1;
                    for (int i=0; i<count; i++) {
                        int id = Integer.parseInt(args[i+1]);
                        Person person = allPeople.get(id);

                        String sex;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                        if (Sex.MALE.equals(person.getSex())) sex = "м";
                        else sex = "ж";

                        System.out.println(person.getName() + " " + sex + " " + simpleDateFormat.format(person.getBirthDay()));
                    }
                    break;
                }
            }case "-d" : {
                synchronized (allPeople) {
                    int count = args.length-1;
                    for (int i=0; i<count; i++) {
                        int id = Integer.parseInt(args[i+1]);
                        Person person = allPeople.get(id);

                        person.setBirthDay(null);
                        person.setName(null);
                        person.setSex(null);
                    }
                }
            }
        }
    }
}
