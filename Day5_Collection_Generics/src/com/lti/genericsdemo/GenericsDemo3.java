package com.lti.genericsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericsDemo3 {
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(200); // auboxing  200 - converting Integer object 		
		myList.add(new Integer(100)); // manually add object 
		//	myList.add(new Long(100));
		//myList.add(new Number(100));
		//myList.add("hello");
		
		ArrayList<Number> numList= new ArrayList<>();
		numList.add(new Integer(100));  
		numList.add(new Long(200));
		numList.add(new Double(200.00));				
		Short s = new Short((short)2);
		numList.add(s);		
		Byte b = new Byte((byte)2);
		numList.add(b);
		
				
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));		
		numbers.add(309L);
		Iterator<Number> iter = numbers.iterator();
		while (iter.hasNext())
			System.out.print(iter.next());
		
	}

}
