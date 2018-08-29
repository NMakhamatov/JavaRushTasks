package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        String key = args[0],
                fileName = args[1],
                fileOutputName = args[2];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Byte> arrayList = new ArrayList<>(fileInputStream.available());
        while (fileInputStream.available()>0) {
            arrayList.add((byte)fileInputStream.read());
        }
        fileInputStream.close();
        byte[] outlist = new byte[arrayList.size()];
        int i= 0;
//        if (key.equals("-e")) {
//                for (Byte b : arrayList) {
//                    outlist[i] = ((byte)(b+1));
//                }
//        } else if (key.equals("-d")){
//            for (Byte b : arrayList) {
//                outlist[i] = ((byte)(b-1));
//            }
//        }
        switch (key){
            case "-e": for (Byte b : arrayList) {
                outlist[i++] = ((byte)(b+1));
            } break;
            case "-d":for (Byte b : arrayList) {
                outlist[i++] = ((byte)(b-1));
            } break;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        fileOutputStream.write(outlist);
        fileOutputStream.close();
    }

}
