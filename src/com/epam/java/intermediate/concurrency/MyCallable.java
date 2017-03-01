package com.epam.java.intermediate.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * This is an example of a callable class
 * @author Christian_Velazquez
 */
public class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		int n = random.nextInt(100_000);
		for(int i=0; i<n; i++){
			System.out.println(Thread.currentThread().getName()+" : "+ i);
		}
		return n;
	}

}
