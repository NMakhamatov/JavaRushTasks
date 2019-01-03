package com.javarush.task.task22.task2201;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Строки нитей или строковые нити? Вот в чем вопрос
*/
//done
public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new ThisUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) {
        Pattern pattern = Pattern.compile("\\t");
        Matcher matcher = pattern.matcher(string);
        int start = -1;
        int end = -1;
        if (matcher.find()) {
            start = matcher.start();
            while (matcher.find()) {
                end = matcher.start();
            }
        } if (start == -1 || start==end || (end-start)==2) {
            if (Solution.FIRST_THREAD_NAME.equals(threadName)) throw new TooShortStringFirstThreadException();
            else if (Solution.SECOND_THREAD_NAME.equals(threadName)) throw new TooShortStringSecondThreadException();
            else throw new RuntimeException();
        }

//        System.out.println("start = " + start + "\nend = " + end);

        return string.substring(start,end);
//        return "";
    }
}
