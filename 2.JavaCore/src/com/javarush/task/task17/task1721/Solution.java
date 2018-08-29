package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine(),
                file2 = scanner.nextLine();
        scanner.close();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            while (bufferedReader.ready()) {
                allLines.add(bufferedReader.readLine());
            }
            bufferedReader.close();
            bufferedReader = new BufferedReader(new FileReader(file2));
            while (bufferedReader.ready()) {
                forRemoveLines.add(bufferedReader.readLine());
            }
            bufferedReader.close();
            Solution solution = new Solution();
            solution.joinData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
