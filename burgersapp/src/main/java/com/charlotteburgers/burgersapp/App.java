package com.charlotteburgers.burgersapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.charlotteburgers.controllerIntfs.*;
import com.charlotteburgers.controllers.*;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
        System.out.println( "Hello Admin, Welcome to the Charlotte Burgers, Please choose from the below options" );
        try {
        	 while(true) {
             	System.out.println("1. Menu, 2. Location, 3.Reservation, 4. Search Nearest Store, 5.Quit");
             	int mainOption = s.nextInt();
             	boolean loopBreak = false;
             	switch(mainOption){
             		case 1: 
             			System.out.println("1. Add Item, 2. Remove Item, 3. Update Item, 4. See Items");
             			int menuOption = s.nextInt();
             			MenuControllerInterface menuController = new MenuController();
             			switch(menuOption) {
             				case 1:
             					menuController.addItem();
             					break;
             				case 2:
             					menuController.removeItem();
             					break;
             				case 3:
             					menuController.updateItem();
             					break;
             				case 4:
             					menuController.getItems();
             					break;
             				default:
             					System.out.println("Please enter valid options");
             			}
             			break;
             		case 2: 
             			System.out.println("1. Add Location, 2. Remove Location, 3. Update Location, 4. Get All Locations");
             			int locOption = s.nextInt();
             			LocationControllerInterface locController = new LocationController();
             			switch(locOption) {
             				case 1:
             					locController.addLocation();
             					break;
             				case 2:
             					locController.removeLocation();
             					break;
             				case 3:
             					locController.updateLocation();
             					break;
             				case 4:
             					locController.getLocations();
             					break;
             				default:
             					System.out.println("Please enter valid options");
             			}
             			break;
             		case 3: 
             			System.out.println("1. Add Reservation, 2. Remove Reservation, 3. Update Reservation, 4. Get All Reservations");
             			int resOption = s.nextInt();
             			ReservationControllerInterface resController = new ReservationController();
             			switch(resOption) {
             				case 1:
             					resController.addReservation();
             					break;
             				case 2:
             					resController.removeReservation();
             					break;
             				case 3:
             					resController.updateReservation();
             					break;
             				case 4:
             					resController.getReservations();
             					break;
             				default:
             					System.out.println("Please enter valid options");
             			}
             			break;
             		case 4:
             			LocationControllerInterface locController2 = new LocationController();
             			locController2.getNearestLocation();
             			break;
             		case 5:
             			loopBreak = true;
             	}
             	if(loopBreak) break;
             }
        }catch(InputMismatchException e) {
        	System.out.println( "Please enter valid inputs");
        }finally {
        	System.out.println( "Thanks for using the Admin Application");
        	s.close();
        }
       
    }
}
