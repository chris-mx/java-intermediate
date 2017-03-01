package com.epam.java.intermediate.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.epam.java.intermediate.domain.Person;

public class ListExample {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		
		List<Person> newPersonList = new LinkedList<>();
		
		personList.add(new Person("Scott", 20, 80F));
		personList.add(new Person("Lauren", 15, 70F));
		personList.add(new Person("Mark", 25, 60F));
		personList.add(new Person("Jhon", 30, 100F));
		personList.add(new Person("Diana", 19, 69F));
		System.out.println(personList.get(2));
		
		for(Person person : personList)
			System.out.println(person);
		
	}
	
}
