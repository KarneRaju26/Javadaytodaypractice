package com.tnsif.day4.inheritence.typesofinheritence;

public class SingleLevelB extends SingleLevelA{
	
	public void print() {
		
		System.out.println("I am a method from class B");
	}
	
	public static void main(String[] args) {
		
		SingleLevelB obj = new SingleLevelB();
		obj.display();
		obj.print();
		
	}

}
