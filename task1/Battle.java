package com.task1;

public class Battle {
    public Soldier s1;
    public Soldier s2;

    public Battle(Soldier _s1, Soldier _s2){
        s1 = _s1;
        s2 = _s2;
    }

    public void startBattle(){
        if(s1.exp < s2.exp){
            Soldier temp;
            temp = s1; s1 = s2; s2 = temp;
        }

        s1.exp += 2; s2.exp += 1;
        s1.health -= 10; s2.health -= 10;

        System.out.println("Battle: " + s1.name + " stronger that " + s2.name);
        System.out.format("Battle: health of %s is %d, experience is %d\n", s1.name, s1.health, s1.exp);
        System.out.format("Battle: health of %s is %d, experience is %d\n", s2.name, s2.health, s2.exp);
    }
}
