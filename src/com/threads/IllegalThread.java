package com.threads;

public class IllegalThread extends Thread {

	
	@Override
	public void run() {
		
		System.out.println("0-args");
		
	}
	public static void main(String[] args) {

		IllegalThread v =new IllegalThread();
		
		v.start();
		v.start();
		
	}

}
