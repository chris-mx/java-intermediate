package com.epam.java.intermediate.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory {

	public enum ListTypes{
		ArrayList, LinkedList;
	}
	
	public static <T> List<T> getList(ListTypes listType){
		if(listType==null)
			throw new IllegalArgumentException("List type is required");
		switch(listType){
			case ArrayList:
				return new ArrayList<>();
			case LinkedList:
				return new LinkedList<>();
		}
		return null;
	}
	
}
