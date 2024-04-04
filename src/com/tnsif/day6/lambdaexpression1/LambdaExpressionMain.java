package com.tnsif.day6.lambdaexpression1;

public class LambdaExpressionMain {
	
	
	public static void main(String[] args) {
		int width =10;
		Drawable1 d1 = ()->{
			
			System.out.println("Drawing "+ width);
		};
		
		d1.draw();
		
		
	}

}
