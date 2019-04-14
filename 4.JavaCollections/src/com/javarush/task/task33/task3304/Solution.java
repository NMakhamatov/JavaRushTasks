package com.javarush.task.task33.task3304;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

/* 
Конвертация из одного класса в другой используя JSON
*/
//done
public class Solution {
    public static void main(String[] args) throws IOException {
        First fir = new First();
        fir.i = 1;
        fir.name = "one-one";

        Second second = new Second();
            second.i = 2;
            second.name = "two";

        Second s = (Second) convertOneToAnother(fir, Second.class);

//        First f = (First) convertOneToAnother(second, First.class);
    }

    public static Object convertOneToAnother(Object one, Class resultClassObject) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        StringWriter writer = new StringWriter();

        objectMapper.writeValue(writer, one);

        String firstClass = one.getClass().getSimpleName().toLowerCase();
        String secondClass = resultClassObject.getSimpleName().toLowerCase();

        String after = writer.toString().replaceFirst(firstClass, secondClass);

        return objectMapper.readValue(after, resultClassObject);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = First.class, name = "first"))
    public static class First {
        public int i;
        public String name;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = Second.class, name = "second"))
    public static class Second {
        public int i;
        public String name;
    }
}
