package com.charlotteburgers.models;

public class MenuItem {
	
	private String menuType;
	private String description;
	private double price;
	
	
	
	public MenuItem(String menuType, String description, double price) {		
		this.menuType = menuType;
		this.description = description;
		this.price = price;
	}
	
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
