/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Manik
 */
public class CarpetApp {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length of the Room: ");
            int length = scanner.nextInt();
            System.out.println("Enter Width of the Room: ");
            int width = scanner.nextInt();
            System.out.println("Enter cost per square foot to cover the Room with Carpet: ");
            int costPerSqFt = scanner.nextInt();
            
            RoomDimension roomDimension = new RoomDimension(length, width);
            RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSqFt);
        
            System.out.println("Total cost incurred to carpet the room is: "+roomCarpet.totalCost());
        
        }catch(InputMismatchException e){
            System.out.println("Application can only take integer values, rerun the App with valid inputs.");
        }  
        
    }
    
    
}
