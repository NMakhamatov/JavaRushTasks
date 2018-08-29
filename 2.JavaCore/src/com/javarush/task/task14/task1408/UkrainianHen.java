package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription() {return super.getDescription() + " Моя страна - Ukraine. Я несу 2 яиц в месяц.";}
}