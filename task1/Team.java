package com.task1;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    ArrayList<Soldier> soldiers;
    Random rand = new Random();
    //ArrayList<Soldier> soldiers = new ArrayList<>();
    public Commander commander;
    public Team(){soldiers = new ArrayList<>();}

    public void appointCommander(Commander com){
        commander = com;
    }

    public void recruitSoldier(Soldier soldier){
        soldier.commander = commander;
        soldiers.add(soldier);
    }

    public Soldier takeRandomSoldier(){
        return soldiers.get(rand.nextInt(0, soldiers.size()));
    }

    public int getExp(){
        int sum_exp=0;
        for (Soldier soldier : soldiers) {
           sum_exp += soldier.exp;
        }
        return sum_exp;
    }
}
