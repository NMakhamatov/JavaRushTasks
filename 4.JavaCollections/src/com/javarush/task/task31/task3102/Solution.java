package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 
Находим все файлы
*/
//done
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        Queue<File>  queue = new LinkedList<>();
        List<String> result = new LinkedList<>();
        File folder = new File(root);

        File[] arr = folder.listFiles();
        if (arr == null) return result;
        else {
            ((LinkedList<File>) queue).addAll(0,Arrays.asList(arr));
        }
        while (!queue.isEmpty()) {
            File currentFile = queue.poll();
            if (currentFile.isDirectory()) {
                arr = currentFile.listFiles();
                ((LinkedList<File>) queue).addAll(0,Arrays.asList(arr));
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\test";
        List<String> list = getFileTree(path);
        System.out.println(list);
    }
}
