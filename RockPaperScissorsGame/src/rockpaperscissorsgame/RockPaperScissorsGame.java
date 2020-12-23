/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorsgame;

import java.util.Scanner;
import model.ComputerPlayer;
import model.Player;

/**
 *
 * @author Manik
 */
public class RockPaperScissorsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
		//Initialize the Scanner and print a welcome message
		Scanner in = new Scanner(System.in);		
                System.out.println("Welcome to Rock, Paper, Scissors!");
                System.out.println("Enter your Name to play with the computer: ");
                String name = in.nextLine();
                
                Player player = new Player();
                ComputerPlayer computer = new ComputerPlayer();
                
                player.setName(name);
		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
			String playerMove = in.nextLine();
			
			//Check if the user wants to quit the game
			if(playerMove.equals("quit")) {
				break;
			}
                        
                        player.setChoice(playerMove);
                        computer.setChoice(ComputerPlayer.generateRandomChoice());
                        
			//Check if the user's move is valid (rock, paper, or scissors)
			if(!Player.validChoices.contains(playerMove)) {
			    System.out.println("Your move isn't valid!");
			
			} else {
                            
			    System.out.println("Computer move: " + computer.getChoice());
                            String computerMove = computer.getChoice();
					
				//Print the results of the game: tie, lose, win
				if(playerMove.equals(computerMove)) {
					System.out.println("It's a tie!");
				} else if((playerMove.equals("rock") && computerMove.equals("scissors")) || (playerMove.equals("scissors") && computerMove.equals("paper")) || (playerMove.equals("paper") && computerMove.equals("rock"))) {
					System.out.println(player.getName() + " won!");
                                        player.increaseCounter();
				} else {
					System.out.println(computer.getName() + " won!");
                                        computer.increaseCounter();
				}

			}

		}

		
		System.out.println("Thanks for playing Rock, Paper, Scissors!");
                System.out.println("You Won: "+player.getWinCounter()+" times | "+ "Computer Won: "+computer.getWinCounter()+" times");

  }
    
}
