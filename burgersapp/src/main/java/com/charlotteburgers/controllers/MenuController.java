package com.charlotteburgers.controllers;

import java.util.Scanner;

import com.charlotteburgers.controllerIntfs.MenuControllerInterface;
import com.charlotteburgers.models.Location;
import com.charlotteburgers.models.MenuItem;
import com.charlotteburgers.stubdata.Database;

public class MenuController implements MenuControllerInterface {
	
	Scanner s = null;
	
	public MenuController() {
		s = new Scanner(System.in);
	}

	@Override
	public void addItem() {
		System.out.println("Enter category of the item to be added");
		String category = s.nextLine();
		System.out.println("Enter name of the item to be added");
		String name = s.nextLine();
		System.out.println("Enter price of the item to be added");
		double price = s.nextDouble();
		MenuItem item = new MenuItem(category, name, price);		
		Database.getInstance().menu.add(item);
		System.out.println("Menu Item Added");
		getItems();
		
	}

	@Override
	public void removeItem() {		
		System.out.println("Enter name of the item to be removed");
		String name = s.nextLine();
		for(MenuItem item : Database.getInstance().menu) {
			if(item.getDescription().equals(name)) {
				Database.getInstance().menu.remove(item);
				System.out.println("Menu item removed");
				getItems();
				return;
			}
		}
		System.out.println("Menu item does not exist");
		
	}

	@Override
	public void updateItem() {
		System.out.println("Enter name of the item to be updated");
		String name = s.nextLine();
		for(MenuItem item : Database.getInstance().menu) {
			if(item.getDescription().equals(name)) {
				System.out.println("Enter price of the item to be updated");
				double price = s.nextDouble();
				item.setPrice(price);
				System.out.println("Menu item updated");
				getItems();
				return;
			}
		}
		System.out.println("Menu item does not exist");
		
	}

	@Override
	public void getItems() {
		System.out.println("Category, Item Name, Price");
		for(MenuItem item : Database.getInstance().menu) {
			System.out.println(item.getMenuType()+", "+item.getDescription()+", "+item.getPrice());
		}
		
	}

}
