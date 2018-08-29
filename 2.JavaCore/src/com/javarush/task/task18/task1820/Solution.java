package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine(),
                file2 = scanner.nextLine();
        scanner.close();
        StringBuilder stringbuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        while (bufferedReader.ready()) {
            stringbuilder.append(bufferedReader.readLine());
        }
        bufferedReader.close();
        String[] numbers = stringbuilder.toString().split(" ");
        PrintWriter printWriter = new PrintWriter(file2);
        for (String number : numbers) {
            BigDecimal bigDecimal = new BigDecimal(number);
            if (bigDecimal.signum() == -1) {
//                System.out.println(bigDecimal.setScale(0,BigDecimal.ROUND_HALF_DOWN));
                            printWriter.print(bigDecimal.setScale(0,BigDecimal.ROUND_HALF_DOWN));
            } else {
//                System.out.println(bigDecimal.setScale(0,BigDecimal.ROUND_HALF_UP));
                            printWriter.print(bigDecimal.setScale(0,BigDecimal.ROUND_HALF_UP));
            }
            printWriter.print(" ");
        }
        printWriter.close();
    }
}
