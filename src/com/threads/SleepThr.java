package com.threads;

class WishThread3 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("Gud Mrngg = " +i);
			
			try {
				
				Thread.sleep(5000);
				
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}


}

public class SleepThr {

	public static void main(String[] args) {

		
		WishThread3 t1 = new WishThread3();
		
		t1.start();
	}

}
