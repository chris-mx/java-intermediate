package com.epam.java.intermediate.comparator;

import java.util.Comparator;
import com.epam.java.intermediate.domain.Person;

/**
 * This is a comparator, used when we need more than one kind of 
 * sorting for a specific class in sorted collections such as TreeSet.  
 * @author Christian_Velazquez
 */
public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
