package com.tnsif.day6interfaces.multipleinheritence;

public class Main {
	
	public static void main(String[] args) {
		Bank b1 = new SBI();
		Bank i1 = new ICICI();
		
		System.out.println(b1.rateofInterest());
		System.out.println(i1.rateofInterest());
	}

}
