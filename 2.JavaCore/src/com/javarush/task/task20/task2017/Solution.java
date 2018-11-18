package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A res = null;
        try {
            Object obj = objectStream.readObject();
            if (obj.getClass() == A.class  || obj.getClass() == B.class) res= (A)obj;
        } catch (Exception e) {
            return null;
        }
        return res;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
