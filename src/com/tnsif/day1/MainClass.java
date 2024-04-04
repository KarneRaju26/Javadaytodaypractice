package com.tnsif.day1;

public class MainClass {
	
	public static void main(String[] args) {
		
		NormalClass n1 = new NormalClass(); // creating objects
		
		//Accessing instance members(variable+methods)
		
		System.out.println(n1.a); //accessing instance variable through objects
		n1.display(); //accessing instance method through objects
		
		
		System.out.println("**************************************");
		
		// Accessing static members(variable+methods)
		
		System.out.println(NormalClass.b); // Accessing static variable through class
		NormalClass.display1(); // By specifying classname.method() we can access static method.
		
	}
}
