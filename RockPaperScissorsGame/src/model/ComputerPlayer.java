/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Manik
 */
public class ComputerPlayer extends Player{
    
    public ComputerPlayer() {
        super("Computer", generateRandomChoice());
    }
    
    public static String generateRandomChoice(){
        int rand = (int)(Math.random()*3);
				
	//Convert the random number to a string using conditionals and print the opponent's move
	String choice;
        switch (rand) {
            case 0:
                choice = "rock";
                break;
            case 1:
                choice = "paper";
                break;
            default:
                choice = "scissors";
                break;
        }
        
        return choice;
    }
    
}
