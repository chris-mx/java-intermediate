package com.epam.java.intermediate.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.epam.java.intermediate.domain.Person;

/**
 * Map examples.
 * @author Christian_Velazquez
 */
public class MapExamples {

	public static void main(String[] args) {
		Map<String, Person> people = new HashMap<>();
		people.put("Anna", new Person("Anna", 99, 50));
		people.put("Marco", new Person("Marco", 76, 50));
		people.put("Louis", new Person("Louis", 19, 50));
		people.put("Hector", new Person("Hector", 55, 50));
		
		for(String key : people.keySet()){
			System.out.println(people.get(key));
		}
		
		Map<String, Person> linkedPeople = new LinkedHashMap<>();
		linkedPeople.put("Anna", new Person("Anna", 99, 50));
		linkedPeople.put("Marco", new Person("Marco", 76, 50));
		linkedPeople.put("Louis", new Person("Louis", 19, 50));
		linkedPeople.put("Hector", new Person("Hector", 55, 50));
		
		for(String key : linkedPeople.keySet()){
			System.out.println(linkedPeople.get(key));
		}
		
		Map<Person, Person> treePeople = new TreeMap<>();
		treePeople.put(new Person("Anna", 99, 50), new Person("Anna", 99, 50));
		treePeople.put(new Person("Marco", 76, 50), new Person("Marco", 76, 50));
		treePeople.put(new Person("Louis", 19, 50), new Person("Louis", 19, 50));
		treePeople.put(new Person("Hector", 55, 50), new Person("Hector", 55, 50));
		
		for(Person key : treePeople.keySet()){
			System.out.println(treePeople.get(key));
		}
		
	}

}
