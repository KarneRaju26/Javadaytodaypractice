package com.tnsif.day5.finall.variable;

public class A {
	
	final int bikeSpeed=50; // variable become constant
	
	void speed(){
		bikeSpeed=125; // Trying to manipulate constant value so getting compile time error
	}

}
