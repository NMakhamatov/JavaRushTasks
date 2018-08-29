package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws Exception{
//        String a = "Иванов Иван Иванович 31 12 1950";
//        String[] data = a.split(" ");
//        String d = data[3] + " " + data[4] + " " + data[5];
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
//        Date date = dateFormat.parse(d);
//        Person person1 = new Person(data[1],data[2],data[0],date);
//        System.out.println(person1);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            try {
                String person = fileScanner.nextLine();
                String[] data = person.split(" ");
                String d = data[3] + " " + data[4] + " " + data[5];
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date date = dateFormat.parse(d);
                return new Person(data[1],data[2],data[0],date);
            } catch (ParseException e) {
                throw new RuntimeException("wrong data format");
            }


        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
