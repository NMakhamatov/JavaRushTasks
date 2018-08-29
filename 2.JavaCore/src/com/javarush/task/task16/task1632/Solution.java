package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }


    public static void main(String[] args) throws Exception {
        Thread4 t = new Thread4();
        t.start();
        Thread.sleep(1000);
        t.showWarning();
//        t.interrupt();
    }
    static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true){

            }
        }
    }static class Thread2 extends Thread {
        @Override
        public void run() {
           try{
               while (true) {
                   Thread.sleep(5);
               }
           } catch (InterruptedException e) {
               System.out.println("InterruptedException");
           }
        }
    }static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);

                } catch (InterruptedException e) {

                }
            }
        }
    }static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
//            System.out.println("Thread4 started!");
            while (!isInterrupted()){}
//            System.out.println("Thread4 stopped!");
        }

        @Override
        public void showWarning() {
//            System.out.println("I am going to interrupt!");
            interrupt();
//            System.out.println("I ve interrupted now");
        }
    }static class Thread5 extends Thread {
        @Override
        public void run() {
            int sum = 0;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            try {
                while (!("N".equals(s=bufferedReader.readLine()))){
                    sum += Integer.valueOf(s);
                } bufferedReader.close();
            } catch (IOException e) {

            }
            System.out.println(sum);

        }
    }

}