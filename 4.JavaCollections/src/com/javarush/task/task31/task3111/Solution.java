package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/* 
Продвинутый поиск файлов
*/
//done
public class Solution {

    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("may");
        searchFileVisitor.setPartOfContent("My name is Alex!");
        searchFileVisitor.setMinSize(500);
        searchFileVisitor.setMaxSize(10000);

        Files.walkFileTree(Paths.get("C:\\Users\\Nursultan\\Desktop\\Java\\IO"), searchFileVisitor);

        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }
    }

}
