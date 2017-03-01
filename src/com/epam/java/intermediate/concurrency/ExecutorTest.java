package com.epam.java.intermediate.concurrency;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Executor service test to run multiple threads
 * @author Christian_Velazquez
 *
 */
public class ExecutorTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(20);
		List<Future<Integer>> results = new ArrayList<>();
		
		for(int i=0; i<20; i++){
			results.add(service.submit(new MyCallable()));
		}
		for(Future<Integer> result : results){
			try {
				System.out.println("Result = "+result.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
		
	}

}
