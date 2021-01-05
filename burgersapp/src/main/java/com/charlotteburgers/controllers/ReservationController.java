package com.charlotteburgers.controllers;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

import com.charlotteburgers.controllerIntfs.ReservationControllerInterface;
import com.charlotteburgers.models.Reservation;
import com.charlotteburgers.stubdata.Database;

public class ReservationController implements ReservationControllerInterface {
	
	Scanner s = null;
	
	public ReservationController() {
		s = new Scanner(System.in);
	}

	@Override
	public void addReservation() {
		System.out.println("Enter your name for the reservation");
		String name = s.nextLine();
		System.out.println("Enter the date your reservation in the format MM/DD/YYYY");		
		String[] dateStrArr = s.nextLine().split("/");
		if(dateStrArr.length != 3) {
			System.out.println("Please enter date in valid format");
			return;
		}try {
			LocalDate resDate = LocalDate.of(Integer.parseInt(dateStrArr[2]),Integer.parseInt(dateStrArr[0]), Integer.parseInt(dateStrArr[1]));
			for(Reservation reservation: Database.getInstance().reservations) {
				if(resDate.equals(reservation.getResDate()) || reservation.getName().equals(name)){
					System.out.println("Reservation already exists for the date, please choose different date");
					return;
				}
			}
			Database.getInstance().reservations.add(new Reservation(name, resDate));
			System.out.println("Reservation Added");
			getReservations();
		}catch(DateTimeException | NumberFormatException e) {
			System.out.println("Please enter valid date field values");
		}
		
	}

	@Override
	public void removeReservation() {
		System.out.println("Enter the name for the reservation to be removed");
		String name = s.nextLine();
		for(Reservation reservation: Database.getInstance().reservations) {
			if(reservation.getName().equals(name)) {
				Database.getInstance().reservations.remove(reservation);
				System.out.println("Reservation Removed");
				getReservations();				
				return;
			}
		}
		System.out.println("No Reservation exists with the given name, try different name");
	}

	@Override
	public void updateReservation() {
		System.out.println("Enter the name for the reservation to be updated");
		String name = s.nextLine();
		System.out.println("Enter the new date your reservation in the format MM/DD/YYYY");		
		String[] dateStrArr = s.nextLine().split("/");
		if(dateStrArr.length != 3) {
			System.out.println("Please enter date in valid format");
			return;
		}
		try {
			LocalDate resDate = LocalDate.of(Integer.parseInt(dateStrArr[2]),Integer.parseInt(dateStrArr[0]), Integer.parseInt(dateStrArr[1]));
			for(Reservation reservation: Database.getInstance().reservations) {
				if(resDate.equals(reservation.getResDate())){
					System.out.println("Reservation already exists for the date, please choose different date");
					return;
				}
			}
			for(Reservation reservation: Database.getInstance().reservations) {
				if(reservation.getName().equals(name)) {
					reservation.setResDate(resDate);
					System.out.println("Reservation Updated");
					getReservations();				
					return;
				}
			}
			System.out.println("No Reservation exists with the given name, try different name");
		}catch(DateTimeException | NumberFormatException e) {
			System.out.println("Please enter valid date field values");
		}
		
		
	}

	@Override
	public void getReservations() {
		System.out.println("Reservation Name, Reservation Date");
		for(Reservation reservation: Database.getInstance().reservations) {
			System.out.println(reservation.getName()+", "+reservation.getResDate());
		}		
	}

}
