package com.epam.java.intermediate.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a generic box, it can hold and work with different
 * kind of objects.
 * 
 * We use different conventions for naming, from Oracle's documentation:
 * 
 * The most commonly used type parameter names are:
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 * 
 * @author Christian_Velazquez
 */
public class Box<T>{

	private T object;
	
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setObject("Martha");
		System.out.println(box.getObject());
		
		Box<Integer> box2 = new Box<>();
		box2.setObject(10);
		System.out.println(box2.getObject());
		
		// We send an anonymous List which we initialize here
		print(new ArrayList<Integer>(){
			{
				add(30);
				add(20);
			}
		});
		
		// We can declare 'list of lists' as well
		List<List<String>> list;
		
	}
	
	private static void print(List<?> objs){
		for(Object obj : objs){
			System.out.println(obj);
		}
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

}
