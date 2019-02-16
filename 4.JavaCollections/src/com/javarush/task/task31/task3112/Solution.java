package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.*;

/*
Загрузчик файлов
*/
//принят, но не работает :)
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        Path target = Paths.get(downloadDirectory.toString(), urlString.substring(urlString.lastIndexOf("/")));
        Path tempFile = Files.createTempFile("temp-",".tmp");

        Files.copy(url.openStream(), tempFile, StandardCopyOption.REPLACE_EXISTING);
        Files.move(tempFile, target,StandardCopyOption.REPLACE_EXISTING);

        return target;
    }
}