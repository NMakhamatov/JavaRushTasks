package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - Russia. Я несу 1 яиц в месяц.";
    }
}