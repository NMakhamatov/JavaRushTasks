package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
*/
//done
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (!(string instanceof String)) throw new TooShortStringException();
        List<Integer> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            list.add(matcher.start());
        }

        if (list.size()<4) throw new TooShortStringException();
        if (list.size()==4) return string.substring(list.get(0) + 1);
        else return string.substring(list.get(0)+1,list.get(4));
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
