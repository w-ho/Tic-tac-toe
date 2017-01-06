package com.fdmgroup.Tic_tac_toe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    Board board = new Board();
    Player player = new Player();
    Check check = new Check();
    int place = 0;
    int place2 = 0;
    
    public Game(){}

    public void play (){
        boolean endGame = false;
        board.clear();
        board.display();
        while(!endGame){
            try {
            	intakeValue();
                if (check.placeAvaible(place, place2, board)) {
                    board.updatefield(place, place2, player);
                    board.display();
                    if (check.winner(board)) {
                        endGame = true;
                    } else if (check.isDraw(board)) {
                        draw();
                    }
                    player.changePlayer();
                } else {
                    System.out.println("This place is not avaible");
                }
            }catch (InputMismatchException e){
                endGame = true;
                System.out.println("You enter a a non number, You lose!");
            }
        }
        player.changePlayer();
        System.out.println("The winner is " + player.getPlayer());
        scanner.close();
    }

    private void intakeValue(){
        System.out.println("Enter the number of row then column");
        place = scanner.nextInt();
        place2 = scanner.nextInt();
    }

    private void draw(){
        System.out.println("Draw, both team lose");
        System.exit(0);
    }
}
