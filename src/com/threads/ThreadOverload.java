package com.threads;

class wishThread1  extends Thread{


	public void run() {

		for(int i=0;i<=10;i++) {              

			System.out.println("first Thread....");
		}

	}


	public void run(int a) {

		for(int i=0;i<=10;i++) {              

			System.out.println("second Thread....");
		}
	}


}
public class ThreadOverload {

	public static void main(String[] args) {

		wishThread1 t1 = new wishThread1();

		t1.start();

		
		System.out.println(Thread.activeCount());

	}
}



