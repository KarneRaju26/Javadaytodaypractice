package com.tnsif.day6.lambdaexpression2;

public class LambdaExpressionMain {
	
	public static void main(String[] args) {
		
		Sayable s1 = (name)->{
			return "Hello" + name;
		};
		
        System.out.println(s1.say("Sonoo"));    

	}

}
