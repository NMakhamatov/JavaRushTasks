package com.javarush.task.task32.task3202;



import java.io.*;

/* 
Читаем из потока
*/
//done
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter writer = new StringWriter();

        if (is == null) return writer;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

        while (bufferedReader.ready()) {
            writer.write(bufferedReader.readLine());
        }

        bufferedReader.close();
        return writer;
    }
}