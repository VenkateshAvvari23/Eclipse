package com.threads;

public class ThreadNameSetting extends Thread {

	public static void main(String[] args) {

		ThreadNameSetting t1 = new ThreadNameSetting();
		t1.start();
		
		ThreadNameSetting t2 = new ThreadNameSetting();
		t2.start();
		
		
		System.out.println("Default thread names");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println("=================================");
		System.out.println("name setting for thread");

		t1.setName("venky");
		t2.setName("jai");
        Thread.currentThread().setName("main thread");
        
        System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getName());
		System.out.println(t2.getName());

	}

}
