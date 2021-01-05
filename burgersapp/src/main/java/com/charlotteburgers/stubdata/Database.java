package com.charlotteburgers.stubdata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import com.charlotteburgers.models.*;


public class Database {
	
	public  ArrayList<Location> locations;
	public  ArrayList<MenuItem> menu;
	public  ArrayList<Reservation> reservations;
	private static Database  dbInstance = null;
	
	private Database() {
		this.locations = new ArrayList<>();
		this.menu = new ArrayList<>();
		this.reservations = new ArrayList<>();
		Location[] locationsArr = {
				new Location(35.315730, -80.742580, 28208, 7043320402L, "1600 W Morehead St"),
				new Location(35.174850, -80.847320, 28209, 7043421193L, "540 Brandywine Rd"),
				new Location(35.147070, -80.808630, 28226, 7043656550L, "7824 Fairview Rd"),
				new Location(35.615300, -97.479580, 28226, 7045251720L, "4009 South Blvd"),
				new Location(35.203300, -80.790460, 28205, 7043774509L, "3101 E Independence Blvd")
		};
		Collections.addAll(this.locations, locationsArr);		
		MenuItem[] menuArr = {
				new MenuItem("Burgers", "Hamburger", 6.00),
				new MenuItem("Burgers", "Cheeseburger", 6.50),
				new MenuItem("Burgers", "Green Eggs & Ham-burger", 8.25),
				new MenuItem("Add Ons", "Fried Egg", 1.15),
				new MenuItem("Add Ons", "Sliced Avocado", 0.99),
				new MenuItem("Sandwiches", "Grilled Chicken Sandwich", 7.25),
				new MenuItem("Sandwiches", "BLT", 6.00),
				new MenuItem("Specials", "Angus Plate", 10.50)
		};
		Collections.addAll(this.menu, menuArr);
		Reservation[] resrvtnArr = {
				new Reservation("Manik Prabhu", LocalDate.of(2021, 1, 10)),
				new Reservation("Krishna", LocalDate.of(2021, 1, 11)),
				new Reservation("Vijay", LocalDate.of(2021, 1, 9)),
				new Reservation("Likith", LocalDate.of(2021, 01, 13))
		};
		Collections.addAll(this.reservations, resrvtnArr);
		
	}
	
	public static Database getInstance() {
		if(dbInstance == null) {
			dbInstance = new Database();
		}
		return dbInstance;
	}

}
