package com.charlotteburgers.models;

public class Location {
	
	private double lat;
	private double lon;
	private long zipcode;
	private long contact;
	private String addressLine;
	
	public Location(double lat, double lon, long zipcode, long contact, String addressLine) {
		super();
		this.lat = lat;
		this.lon = lon;
		this.zipcode = zipcode;
		this.contact = contact;
		this.addressLine = addressLine;
	}

	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	

}
