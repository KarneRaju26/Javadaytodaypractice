package com.tnsif.day1;

public class Approach1 {
	
	int a =10; //instance variable
	static int b=20; //static variable
	
	
	
	public static void main(String[] args) {
		
		int c=30; //local variable
		
		
		//Accessing instance Variable by creating objects
		Approach1 a1 = new Approach1();
		System.out.println(a1.a);
		
		// Accessing static variable through class
		
		System.out.println(Approach1.b);
		
		//or Accessing same static variable by specific variable itself
		
		System.out.println(b);
		
		//Accessing local variable
		System.out.println(c);
		
	}

}
