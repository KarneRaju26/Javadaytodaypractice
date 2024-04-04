package com.tnsif.day4.encapsulation;

public class Main2getterssetters {
	
	public static void main(String[] args) {
		Car2getterssetters c2= new Car2getterssetters();
		c2.setSpeed(50);
		System.out.println(c2.getSpeed());
		
		
		c2.setDoors("Closed");
		System.out.println(c2.getDoors());
		
		
		c2.setDrivers("Seated");
		System.out.println(c2.getDrivers());
		
	}

}
