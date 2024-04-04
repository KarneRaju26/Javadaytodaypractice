package com.tnsif.day5.practice;


	
	
	
	class Runner1 implements Runnable{

		@Override
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
	
	public class App1 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner1());
		
		t1.start();
		t2.start();
		
	}

}
