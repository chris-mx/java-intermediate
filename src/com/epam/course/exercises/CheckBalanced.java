package com.epam.course.exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Basic check for a valid parenthesis string
 * @author Christian_Velazquez
 */
public class CheckBalanced {

	private static final Map<Character, Character> validBrackets = new HashMap<>(3);
	
	static{
		validBrackets.put('(', ')');
		validBrackets.put('[', ']');
		validBrackets.put('{', '}');
	}
	
	public static void main(String[] args) {
		System.out.println(checkIfBalanced("{{[{{}()()}]}}))"));
	}
	
	private static boolean checkIfBalanced(String stringToCheck){
		if(stringToCheck==null || stringToCheck.isEmpty())
			throw new IllegalArgumentException("String can't be null or empty");
		if(stringToCheck.length()%2!=0)
			return false;
		Deque<Character> stack = new ArrayDeque<>();
		for(int i=0; i<stringToCheck.length(); i++){
			Character current = stringToCheck.charAt(i);
			Character closure = validBrackets.get(current);
			if(closure!=null){
				System.out.println("Push "+current);
				stack.push(current);
			}else{
				if(stack.isEmpty())
					return false;
				Character last = stack.pop();
				System.out.println("Pop "+last);
				if(!current.equals(validBrackets.get(last))){
					return false;
				}
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
