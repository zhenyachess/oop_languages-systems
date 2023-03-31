package com.task1;

import java.util.Random;

public class Task1 {
    private static final int NUMBER_OF_SOLDIERS = 100;
    public static void main(String[] args){
        Random rand = new Random();

        Commander com1 = new Commander("red_team");
        Commander com2 = new Commander("blue_team");

        Team redTeam = new Team();
        Team blueTeam = new Team();

        redTeam.appointCommander(com1);
        blueTeam.appointCommander(com2);

        for(int i=0; i < NUMBER_OF_SOLDIERS; i++) {
            Soldier soldier = new Soldier();
            if (rand.nextBoolean()) {
                redTeam.recruitSoldier(soldier);
            } else {
                blueTeam.recruitSoldier(soldier);
            }
        }

        System.out.println("Number of soldiers in red team is " + redTeam.soldiers.size());
        System.out.println("Number of soldiers in blue team is " + blueTeam.soldiers.size());

        System.out.println("Strength of red team: " + redTeam.commander.strengthTeam);
        System.out.println("Strength of blue team: " + blueTeam.commander.strengthTeam);

        int redTeamExp = redTeam.getExp(), blueTeamExp = blueTeam.getExp();

        System.out.println("Experience of red team: " + redTeamExp);
        System.out.println("Experience of blue team: " + blueTeamExp);

        if(redTeamExp > blueTeamExp){
            redTeam.commander.strengthTeam++;
        }else{
            blueTeam.commander.strengthTeam++;
        }

        System.out.println("Strength of red team: " + redTeam.commander.strengthTeam);
        System.out.println("Strength of blue team: " + blueTeam.commander.strengthTeam);

        System.out.println("Let's take for one soldier of each team:");

        Soldier soldierRed = redTeam.takeRandomSoldier();
        Soldier soldierBlue = blueTeam.takeRandomSoldier();

        soldierRed.showInfo();
        soldierBlue.showInfo();

        System.out.println("Let's begin the battle between these two:");

        Battle battle = new Battle(soldierRed, soldierBlue);
        battle.startBattle();
    }
}
