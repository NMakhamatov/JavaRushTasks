package com.javarush.task.task14.task1408;

 class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }
    String getDescription() {return super.getDescription() + " Моя страна - Moldova. Я несу 3 яиц в месяц.";}
}
