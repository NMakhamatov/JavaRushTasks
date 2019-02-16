package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

/*
Проход по дереву файлов
*/
//done
public class Solution {
    public static void main(String[] args) throws IOException {
        File goal = new File(args[1]);
        String pathname = goal.getParent();
        File newGoal = new File(pathname + "\\" + "allFilesContent.txt");
        FileUtils.renameFile(goal,newGoal);

        TreeMap<String,String> map = new TreeMap<>();
        tree(args[0],map);

        FileOutputStream fileOutputStream = new FileOutputStream(newGoal);
        write(map,fileOutputStream);
        fileOutputStream.close();
    }
    public static void tree(String path, TreeMap<String,String> map) throws IOException{
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (File f : files) {
            if (f.isDirectory()) tree(f.getAbsolutePath(),map);
            else {
                if (f.length() <= 50){
                    map.put(f.getName(),f.getAbsolutePath());
                }
            }
        }
    }
    private static void write(TreeMap<String,String> map, FileOutputStream outputStream)throws IOException {
        for (Map.Entry<String,String> entry : map.entrySet()) {
            outputStream.write(Files.readAllBytes(Paths.get(entry.getValue())));
            outputStream.write("\n".getBytes());
        } outputStream.flush();
    }
}
