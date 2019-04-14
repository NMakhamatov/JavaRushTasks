package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/* 
Десериализация JSON объекта
*/
//done
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        File file = new File(fileName);
        ObjectMapper objectMapper = new ObjectMapper();

        T object = objectMapper.readValue(file, clazz);
        return object;
    }

    public static void main(String[] args) {

    }
}
