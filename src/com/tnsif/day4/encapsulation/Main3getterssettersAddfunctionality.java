package com.tnsif.day4.encapsulation;

public class Main3getterssettersAddfunctionality {
	
	public static void main(String[] args) {
		Car3getterssetterAddfunctinality car = new Car3getterssetterAddfunctinality ();
		car.setSpeed (9);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run ());
	}

}
