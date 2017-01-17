package com.whogroup.Tic_tac_toe;

public class Board {

    private int length = 3 ;
    public String[][] playBoard = new String[length][length];

    public void clear(){
        for (int i=0;i<playBoard.length;i++){
            for(int j=0;j<playBoard.length;j++){
                playBoard[i][j] = " ";
            }
        }
    }

    public void display(){
        for (int i = 0; i < playBoard.length ; i++) {
            String checker = "|";
            for (int j = 0; j < playBoard.length ; j++) {
                checker += " " +playBoard[i][j] + " " + "|";
            }
        System.out.println(checker);
        }
    }

    public void updatefield(int place, int place2, Player player){
        playBoard[place-1 ][place2-1] =  player.getPlayer();
    }


}
