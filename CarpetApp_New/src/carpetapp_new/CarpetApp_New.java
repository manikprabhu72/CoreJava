/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetapp_new;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Manik
 */
public class CarpetApp_New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try{
             HashMap<String, String> countryMap = CountryWiseMap.getCountryUnitMap();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Country Code from US, UK, IN and AUS: ");
            String countryCode = scanner.nextLine();
            if(countryMap.keySet().contains(countryCode)){
                String lengthUnit = countryMap.get(countryCode);
                System.out.println("Enter length of the Room in "+lengthUnit+": ");
                int length = scanner.nextInt();
                System.out.println("Enter Width of the Room in "+lengthUnit+": ");
                int width = scanner.nextInt();                
                int costPerSqFt = CountryWiseMap.getCountryPriceMap().get(countryCode);
            
                RoomDimension roomDimension = new RoomDimension(length, width);
                RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSqFt);
        
                System.out.println("Total cost incurred to carpet the room is: "+roomCarpet.totalCost());
            }else{
                System.out.println("Please enter valid country code, rerun the App with valid inputs.");
            }            
     
        }catch(InputMismatchException e){
            System.out.println("Application can only take integer values, rerun the App with valid inputs.");
        }  
    }
    
}
