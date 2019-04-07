package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;

/*
Разархивируем файл
*/
//todo доделать
public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Solution.class.getResourceAsStream("Условие.jrtc");
        System.out.println(inputStream.toString());
        System.out.println("----------------------");
        byte[] bytes = new byte[1024];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.read(bytes);
        String s = new String(bytes);
        System.out.println(s);
    }
}
