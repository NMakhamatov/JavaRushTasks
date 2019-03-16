package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* 
Шифр Цезаря
*/
//done

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (reader == null) return "";
        int ch = -1;
        while ((ch = reader.read()) != -1) {
            byteArrayOutputStream.write(ch + key);
        }
        byteArrayOutputStream.flush();
        if (byteArrayOutputStream.size() == 0) return "";
        return new String(byteArrayOutputStream.toByteArray());
    }
}
