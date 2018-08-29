package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String f = scanner.nextLine();
            try {
                FileReader file = new FileReader(f);
                file.close();
            } catch (FileNotFoundException e) {
                System.out.println(f);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
