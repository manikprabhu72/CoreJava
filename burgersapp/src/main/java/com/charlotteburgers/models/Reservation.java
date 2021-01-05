package com.charlotteburgers.models;

import java.time.LocalDate;

public class Reservation {
	
	private String name;
	private LocalDate resDate;
	
	public Reservation(String name, LocalDate resDate) {		
		this.name = name;
		this.resDate = resDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getResDate() {
		return resDate;
	}
	public void setResDate(LocalDate resDate) {
		this.resDate = resDate;
	}
	
	

}
