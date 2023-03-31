package com.task1;

public class Soldier extends Human{
    public Commander commander;
    public int exp;

    public Soldier(){
        super();
        exp = rand.nextInt(1, 12);
    }

    public void showInfo(){
        System.out.println(name + ": exp = " + exp + ", health = " + health);
    }

    public void myCommander(){
        if(commander != null){
            System.out.println(name + ": My commander is " + commander.name + ". His team is " + commander.nameTeam);
        }else{
            System.out.println(name + ": I do not have a commander");
        }
    }
}
