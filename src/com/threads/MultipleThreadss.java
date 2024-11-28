package com.threads;

class MyThreadpriority extends Thread{
	
	public void run() {
		
		System.out.println("Thread name "+Thread.currentThread().getName());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
	}
}


public class MultipleThreadss {

	public static void main(String[] args)  {

		MyThreadpriority t1 = new MyThreadpriority();
		MyThreadpriority t2 = new MyThreadpriority();
		
		t1.setPriority(Thread.MAX_PRIORITY); //t1.setPriority(10)
		t2.setPriority(Thread.MIN_PRIORITY); //t2.setPriority(1)

		t1.start();
		t2.start();
		
		System.out.println("Thread name "+Thread.currentThread().getName());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
	}
}