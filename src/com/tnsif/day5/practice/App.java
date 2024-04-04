package com.tnsif.day5.practice;


class Runner extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+ i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		
		System.out.println("First Process");
		Runner r1 = new Runner();
		r1.start();
		
		System.out.println("Second Process");
		
		Runner r2 = new Runner();
		r2.start();

	}

}
