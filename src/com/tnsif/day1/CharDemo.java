//program to demonstrate char data type
package com.tnsif.day1;

public class CharDemo {
	public static void main(String[] args) {
		// assigning single character literal
		char ch = 'A';
		System.out.println(ch);

		// assigning number to char
		char ch1 = 65;
		System.out.println(ch1);
		
		char ch2 = 66;
		System.out.println(ch2);

		// assigning unicode to char
		char var1 = '\u00A7';
		System.out.println(var1);

		// Unicode representation
		char var2 = '\u20AC';
		System.out.println(var2);
		
		char var3 = '\u221E';
		System.out.println(var3);		

		// ASCI code representation
		int a = 'A';
		System.out.println(a);
		
		char a1 = 'A';
		System.out.println(a1);
	}
}