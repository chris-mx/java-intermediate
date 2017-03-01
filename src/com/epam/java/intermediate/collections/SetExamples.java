package com.epam.java.intermediate.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.epam.java.intermediate.comparator.NameComparator;
import com.epam.java.intermediate.domain.Person;

/**
 * Set examples
 * @author Christian_Velazquez
 *
 */
public class SetExamples {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("Christian");
		mySet.add("Marco");
		mySet.add("Louis");
		mySet.add("Hector");
		print(mySet);
		
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Christian");
		linkedSet.add("Marco");
		linkedSet.add("Louis");
		linkedSet.add("Hector");
		print(linkedSet);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Christian");
		treeSet.add("Marco");
		treeSet.add("Louis");
		treeSet.add("Hector");
		print(treeSet);
		
		Set<Person> people = new TreeSet<>(new NameComparator());
		people.add(new Person("Christian", 10, 50));
		people.add(new Person("Marco", 76, 50));
		people.add(new Person("Louis", 19, 50));
		people.add(new Person("Hector", 55, 50));
		people.add(new Person("Anna", 99, 50));
		print(people);
	}

	private static void print(Set<?> set){
		System.out.println();
		Iterator<?> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
}
