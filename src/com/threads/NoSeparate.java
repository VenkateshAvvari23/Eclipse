package com.threads;

public class NoSeparate extends Thread {

	@Override
	public void run() {
		
		System.out.println("0-args");
		
	}
	public static void main(String[] args) {
		
		NoSeparate n = new NoSeparate();
		n.start();

		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
	}

}
