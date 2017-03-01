package com.epam.java.intermediate.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.epam.java.intermediate.domain.Person;

/**
 * Stack and Queue examples
 * @author Christian_Velazquez
 *
 */
public class StacksAndQueues {

	public static void main(String[] args) {
		testQueues();
		Queue<Person> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(new Person("Martha", 10, 10));
		priorityQueue.offer(new Person("Scott", 5, 10));
		priorityQueue.offer(new Person("Kirk", 8, 10));
		priorityQueue.offer(new Person("Harsha", 20, 10));
		printQueue(priorityQueue);
		testStacks();
	}
	
	
	private static void testQueues(){
		Queue<String> linkedQueue = new LinkedList<>();
		linkedQueue.offer("Christian");
		linkedQueue.offer("Martha");
		linkedQueue.offer("Kirk");
		linkedQueue.offer("Scott");
		
		System.out.println(linkedQueue.peek());
		System.out.println(linkedQueue.peek());
		printQueue(linkedQueue);
	}
	
	private static void testStacks(){
		Deque<Integer> linkedStack = new LinkedList<>();
		Deque<Integer> arrayStack = new ArrayDeque<>();
		arrayStack.push(1);
		arrayStack.push(8);
		arrayStack.push(11);
		arrayStack.push(7);
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack.peek());
		printDeque(arrayStack);
	}
	
	// 7 11 8 1
		private static void printQueue(Queue queue){
			while(!queue.isEmpty()){
				System.out.println(queue.poll());
			}
		}
	
	// 7 11 8 1
	private static void printDeque(Deque<Integer> deque){
		while(!deque.isEmpty()){
			System.out.println(deque.pop());
		}
	}

}
