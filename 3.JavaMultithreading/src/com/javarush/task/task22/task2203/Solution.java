package com.javarush.task.task22.task2203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Между табуляциями
*/
//done
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string==null) throw new TooShortStringException();
        Pattern pattern = Pattern.compile("\\t");
        Matcher matcher = pattern.matcher(string);

        int start=-1;
        int end=-1;

        if (matcher.find())start = matcher.start();
        else throw new TooShortStringException();

        if (matcher.find()) end = matcher.start();
        else throw new TooShortStringException();

        return string.substring(start+1,end);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
