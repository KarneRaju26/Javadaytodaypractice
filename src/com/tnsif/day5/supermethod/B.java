package com.tnsif.day5.supermethod;

public class B extends Animal {
	
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
	super.eat();  
	bark();  
	}

}
