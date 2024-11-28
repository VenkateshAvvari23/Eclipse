package com.threads;

class wishThread  extends Thread{

	@Override
	public void run() {

		for(int i=0;i<=10;i++) {              // user defined thread

			System.out.println("first Thread....");
		}
	}
}

                             

public class Mythread  {              // Two threads are running concurrently

	public static void main(String[] args) {

		wishThread t1 = new wishThread();

		t1.start();
		// t1.start();   // IllegalThreadStateException


		for(int i=0;i<=10;i++) {

			System.out.println("Main thread ....");
		}
	}
}
