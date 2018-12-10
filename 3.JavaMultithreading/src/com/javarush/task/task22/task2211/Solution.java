package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
Смена кодировки
*/
//done
public class Solution {
    public static void main(String[] args) throws IOException {
//        String filePath1 = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt";
//        String filePath2 = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\out.txt";

        File file = new File(args[0]);
        Scanner scanner = new Scanner(file,"windows-1251");
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            writer.write(new String(scanner.nextLine().getBytes(StandardCharsets.UTF_8)));
            writer.newLine();
        }
        scanner.close();
        writer.flush();
        writer.close();
    }
}
