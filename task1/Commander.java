package com.task1;

public class Commander extends Human{
    public String nameTeam;
    public int strengthTeam;

    public Commander(String _nameTeam){
        super();
        nameTeam = _nameTeam;
        strengthTeam = rand.nextInt(1, 4);
        name += "[commander]";
    }

    public void strengthInc(){
        if(strengthTeam < 3){
            this.strengthTeam++;
        }
    }
}
