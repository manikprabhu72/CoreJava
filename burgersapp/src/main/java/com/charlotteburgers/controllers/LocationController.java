package com.charlotteburgers.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import com.charlotteburgers.controllerIntfs.LocationControllerInterface;
import com.charlotteburgers.models.Location;
import com.charlotteburgers.stubdata.Database;
import com.charlotteburgers.util.MyUtilities;

public class LocationController implements LocationControllerInterface{
	
	Scanner s = null;
	
	public LocationController() {
		s = new Scanner(System.in);
	}

	@Override
	public void addLocation() {
		System.out.println("Enter latitude of the location to be added");
		double lat = s.nextDouble();
		System.out.println("Enter longitude of the location to be added");
		double lng = s.nextDouble();
		System.out.println("Enter zipcode of the location to be added");
		long zipcode = s.nextLong();
		System.out.println("Enter contact number of the location to be added");
		long phnNumber = s.nextLong();
		System.out.println("Enter Address of the location to be added");
		s.nextLine();
		String address = s.nextLine();
		Location tempLoc = new Location(lat, lng, zipcode, phnNumber, address);
		Database.getInstance().locations.add(tempLoc);
		System.out.println("Location Added");
		getLocations();
	}

	@Override
	public void removeLocation() {
		System.out.println("Enter latitude of the location to be removed");
		double lat = s.nextDouble();
		System.out.println("Enter longitude of the location to be removed");
		double lng = s.nextDouble();	
		for(Location loc: Database.getInstance().locations) {
			if(loc.getLat() == lat && loc.getLon() == lng) {
				Database.getInstance().locations.remove(loc);
				System.out.println("Location Successfully removed");
				getLocations();
				return;
			}
		}
		System.out.println("Location does not exist");
		
	}

	@Override
	public void updateLocation() {
		System.out.println("Enter latitude of the location to be updated");
		double lat = s.nextDouble();
		System.out.println("Enter longitude of the location to be updated");
		double lng = s.nextDouble();	
		for(Location loc: Database.getInstance().locations) {
			if(loc.getLat() == lat && loc.getLon() == lng) {
				System.out.println("Enter contact number of the location to be updated");
				long phnNumber = s.nextLong();
				loc.setContact(phnNumber);
				System.out.println("Location Successfully updated");
				getLocations();
				return;
			}
		}
		System.out.println("Location does not exist");
		
	}

	@Override
	public void getLocations() {
		System.out.println("Latitude, Longitude, zipcode, AddressLine, PhoneNumber");
		for(Location loc: Database.getInstance().locations) {											
			System.out.println(loc.getLat()+", "+loc.getLon()+", "+loc.getZipcode()+", "+loc.getAddressLine()+", "+loc.getContact());							
		}
		
	}

	@Override
	public void getNearestLocation() {
		System.out.println("To Search nearest store to your location: ");
		System.out.println("Enter latitude of your location");
		double lat = s.nextDouble();
		System.out.println("Enter longitude of your location");
		double lng = s.nextDouble();
		ArrayList<Location> locations = Database.getInstance().locations;
		Location minLoc = null;
		double minDist = Double.MAX_VALUE;
		if(locations.size() != 0) {
			for(Location location: locations) {
				double dist = MyUtilities.distance(lat, lng, location.getLat(), location.getLon());
				if(minDist > dist) {
					minDist = dist;
					minLoc = location;
				}
			}
			System.out.println("Details of the nearest location are: ");
			System.out.println("Address: "+ minLoc.getAddressLine()+" "+minLoc.getZipcode()+", Contact Number: "+minLoc.getContact());
			return;
		}
		System.out.println("There are no nearest stores to your location" );
	}

}
