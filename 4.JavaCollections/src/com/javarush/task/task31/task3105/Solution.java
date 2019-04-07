package com.javarush.task.task31.task3105;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
//todo доделать
public class Solution {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\IN.txt");
        String zipFile = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\io.zip";
        Map<String,byte[]> map = read(zipFile);
//        write(filePath,zipFile,map);
        for (Map.Entry<String,byte[]> entry :map.entrySet()) {
            System.out.println(new String(entry.getValue()));
        }

    }
    /*
    читает файлы из архива, но не может прочитать файлы из папок внутри архива
     */
    static HashMap<String,byte[]> read(String zipFile) {
        HashMap<String,byte[]> map = new HashMap<>();
        try (
                ZipInputStream inputStream = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while ((entry = inputStream.getNextEntry()) != null) {
                ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len = 0;
                int offset = 0;
                while ((len = inputStream.read(buffer))>0) {
                    arrayOutputStream.write(buffer,offset,len);
                    offset += len;
                }
                map.put(entry.getName(),arrayOutputStream.toByteArray());
                inputStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return map;
    }

    static void write(Path filePath,String zipFile,Map<String,byte[]> map) {
        try( ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
        ) {
            //не заходит в папку в архиве
            for (Map.Entry<String,byte[]> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key.equals("new\\" + filePath.getFileName())) continue;
                ZipEntry zipEntry = new ZipEntry(key);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.write(entry.getValue());
                zipOutputStream.closeEntry();
            }
            ZipEntry zipEntry = new ZipEntry("new\\" + filePath.getFileName());
            zipOutputStream.putNextEntry(zipEntry);
            Files.copy(filePath,zipOutputStream);
            zipOutputStream.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
