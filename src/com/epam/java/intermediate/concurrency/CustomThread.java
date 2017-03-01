package com.epam.java.intermediate.concurrency;

/**
 * Custom thread created implementing Runnable
 * @author Christian_Velazquez
 */
public class CustomThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Starting "+Thread.currentThread().getName());
		for(int i=0; i<100_000;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}

}
