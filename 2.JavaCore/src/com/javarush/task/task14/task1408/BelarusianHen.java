package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
    String getDescription() {return super.getDescription() + " Моя страна - Belarus. Я несу 4 яиц в месяц.";}
}
