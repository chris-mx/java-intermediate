package com.epam.course.exercises;

import com.epam.java.intermediate.domain.Person;

/**
 * Init implementation of a linked list
 * @author Christian_Velazquez
 *
 */
public class MyList {

	private Person lastPerson;
	private int size;
	
	public void add(Person newPerson){
		if(newPerson==null){
			throw new IllegalArgumentException("The person can't be null");
		}
		if(lastPerson==null){
			lastPerson = newPerson;
		}else{
			newPerson.setNextPerson(lastPerson);
			lastPerson = newPerson;
		}
		size++;
	}
	
	public Person get(int index){
		if(index<0 || index>size)
			throw new IllegalArgumentException("Index must be between 0 and "+size);
		Person current = lastPerson;
		for(int i=1; i<index; i++){
			current = current.getNextPerson();
		}
		return current;
	}
	
	public boolean contains(Person person){
		Person current = lastPerson;
		while(current!=null){
			if(current.equals(person)){
				return true;
			}
		}
		return false;
	}
	
	public void print(){
		Person current = lastPerson;
		while(current!=null){
			System.out.println(current);
			current = current.getNextPerson();
		}
	}
	
	public static void main(String... args){
		MyList list = new MyList();
		list.add(new Person("Scott", 20, 80F));
		list.add(new Person("Lauren", 15, 70F));
		list.add(new Person("Mark", 25, 60F));
		list.add(new Person("Jhon", 30, 100F));
		list.add(new Person("Diana", 19, 69F));
		list.print();
		System.out.println(list.get(2));
	}
	
}
