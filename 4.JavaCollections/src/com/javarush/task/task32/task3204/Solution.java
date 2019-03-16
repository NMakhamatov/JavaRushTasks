package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.Random;

/* 
Генератор паролей
done


0 = 48
9 = 57
a = 97
z = 122
A = 65
Z = 90
 */
public class Solution {
    static Random random = new Random();

    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        int[] ints = {-1, -1, -1, -1, -1, -1, -1, -1};

        int lowLetterPosition = random.nextInt(8);
        int upperLetterPosition;
        int number;

        while ((upperLetterPosition = random.nextInt(8)) == lowLetterPosition);
        while ((number = random.nextInt(8)) == lowLetterPosition ||  number == upperLetterPosition);

        ints[lowLetterPosition] = getLowLetter();
        ints[upperLetterPosition] = getUpperLetter();
        ints[number] = getNumber();

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != -1) {
                byteArrayOutputStream.write(ints[i]);
                continue;
            }
            ints[i] = getRandomCharacter();
            byteArrayOutputStream.write(ints[i]);
        }
        return byteArrayOutputStream;
    }

    private static int getLowLetter() {
        int result = 0;

        while (result < 'a' || result > 'z') {
            result = random.nextInt(200);
        }
        return result;
    }

    private static int getUpperLetter() {
        int result = 0;

        while (result < 'A' || result > 'Z') {
            result = random.nextInt(150);
        }
        return result;
    }

    private static int getNumber() {
        int result = 0;

        while (result < '0' || result > '9') {
            result = random.nextInt(100);
        }
        return result;
    }

    private static int getRandomCharacter() {
        int p = random.nextInt(3);

        if (p == 0) return getLowLetter();
        else if (p == 1) return getUpperLetter();
        else return getNumber();
    }
}