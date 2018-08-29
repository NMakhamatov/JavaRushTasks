package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if ("Ukraine".equals(country)) hen = new UkrainianHen();
            if ("Russia".equals(country)) hen = new RussianHen();
            if ("Moldova".equals(country)) hen = new MoldovanHen();
            if ("Belarus".equals(country)) hen = new BelarusianHen();

            return hen;
        }
    }


    }
