package com.tnsif.day5.as.privatte;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
		a1.display();  // cannot able access display() method which is present in class A. because display() is private members.
						// Private access scope is limited to class itself.

	}

}
