package com.whogroup.Tic_tac_toe;

public class Player {

    public String player = "x";

    public void changePlayer(){
        if (player == "x") {
            player = "o";
        } else {
            player = "x";
        }
    }

    public String getPlayer(){
        return player;
    }
}
