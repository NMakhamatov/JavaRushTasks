package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//done
public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws Exception {
        Horse whiteHorse = new Horse("white",3.0,0);
        Horse blackHorse = new Horse("black",3.0,0);
        Horse greyHorse = new Horse("grey",3.0,0);
        List<Horse> horses = new ArrayList<>();
        horses.add(whiteHorse);
        horses.add(blackHorse);
        horses.add(greyHorse);

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException{
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
//        printWinner();
    }
    public void move(){
        for (Horse h : horses) {
            h.move();
        }
    }
    public void print(){
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner(){
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(horses.get(0));
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
