package com.epam.java.intermediate.domain;

/**
 * This class implements Comparable so it can be used in PriorityQueue,
 * TreeSet, TreeMap and other sorted collections.
 * @author Christian_Velazquez
 */
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private float weight;
	private Person nextPerson;
	
	public Person(String name, int age, float	 weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Person getNextPerson() {
		return nextPerson;
	}
	public void setNextPerson(Person nextPerson) {
		this.nextPerson = nextPerson;
	}
	
	@Override
	public String toString(){
		return name + ", " + age + ", " + weight;
	}

	@Override
	public int compareTo(Person o) {
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else
			return -1;
	}
	
}
