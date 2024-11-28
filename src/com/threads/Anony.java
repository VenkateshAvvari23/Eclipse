package com.threads;

public class Anony {

	public static void main(String[] args) {

		
		Thread t = new Thread() {
			
			       public void run() {
			    	   
			    	   System.out.println("Good Mrng ..."+Thread.currentThread().getName());
			       }
		};
		
		t.start();
	}

}
