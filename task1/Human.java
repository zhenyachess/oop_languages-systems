package com.task1;
import java.util.Random;

public class Human {
    public String name;
    public int health;
    Random rand = new Random();

    public Human(){
        name = "Soldier#" + rand.nextInt(1, 301);
        health = rand.nextInt(80, 101);
    }
}
