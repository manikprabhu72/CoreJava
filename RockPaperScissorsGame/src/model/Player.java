/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Manik
 */
public class Player {
       
    private String name;
    private String choice;
    private int winCounter;
    
    
    
    public static Set<String> validChoices = new HashSet<>(Arrays.asList("rock","paper","scissors"));

    public Player(String name, String choice) {        
        this.name = name;
        this.choice = choice;
        this.winCounter = 0;
    }

    public Player() {
        this.winCounter = 0;
    }
        

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public int getWinCounter() {
        return winCounter;
    }

    public void setWinCounter(int winCounter) {
        this.winCounter = winCounter;
    }
    
    public void increaseCounter(){
        this.winCounter++;
    }
    
    
}
