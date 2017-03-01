package com.epam.java.intermediate.concurrency;

/**
 * Example of basic operations with threads
 * @author Christian_Velazquez
 *
 */
public class ThreadsTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new CustomThread(), "My first thread");
		t1.start();
		Thread t2 = new Thread(new CustomThread(), "My second thread");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		Thread t3 = new Thread(new CustomThread(), "My third thread");
		t3.start();
	}

}
