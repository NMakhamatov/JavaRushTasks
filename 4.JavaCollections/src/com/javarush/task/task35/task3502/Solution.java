package com.javarush.task.task35.task3502;

import java.util.List;

/*
Знакомство с дженериками
*/
//done
public class Solution<T extends List<Solution.SomeClass>> {
    public static class SomeClass<TT extends Number> {
    }

    public static void main(String[] args) {

    }
}
