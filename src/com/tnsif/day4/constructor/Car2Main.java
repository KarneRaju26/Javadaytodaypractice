package com.tnsif.day4.constructor;

public class Car2Main {
	
	public static void main(String[] args) {
		Car2Parametrized c2 = new Car2Parametrized("closed"	, "on", "seated", 10);
		Car2Parametrized c3 = new Car2Parametrized("closed"	, "on", "seated", -10);
		
		
		
		System.out.println(c2.run());
		System.out.println(c3.run());
		
	}

}
