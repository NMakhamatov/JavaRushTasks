package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    private int lastId;
    public static void main(String[] args) throws Exception {
        if (args.length!=0) {
            Solution solution = new Solution();
            Scanner scanner = new Scanner(System.in);
            String file = scanner.nextLine();
            scanner.close();
//        String file = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt";

            StringBuilder sb = solution.read(file);
            String id = solution.parToLen(Integer.toString(++solution.lastId),8);
            String productName = solution.parToLen(args[1],30);
            String price = solution.parToLen(args[2],8);
            String quantity = solution.parToLen(args[3],4);
            String text = sb.append(id).append(productName).append(price).append(quantity).toString();


            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(text);
            bufferedWriter.close();
        }


    }
     StringBuilder read(String file) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lastLine = "";
        int maxId = 0;
        while (bufferedReader.ready()){
            lastLine = bufferedReader.readLine();
            if (lastLine.length()>0) {
                int id = Integer.parseInt(lastLine.substring(0,8).trim());
                if (id>maxId) maxId = id;
            }
            sb.append(lastLine);
            sb.append("\n");
        }
        String num = lastLine.substring(0,8);
        num=num.trim();
        lastId = maxId;
        bufferedReader.close();
        return sb;
    }
    String parToLen(String par,int len) {
        String res = par;
        int currentLength = res.length();
        while (currentLength != len) {
            res+=" ";
            currentLength++;
        }
        return res;
    }
}
