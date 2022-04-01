package com.lti.genericsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
	
	public static void main(String[] args) {
		
		
		ArrayList strings= new ArrayList();
		
		strings.add("Hello");  // autoboxing 
		strings.add("world");
		
		strings.add(100);
		
		//String str =strings.get(0); // unboxing not happening 
	//	bec compiler does not know the type of object it will return at compilation //manually casting 
		//Generics - offer u compile time safety 
		
		ArrayList<String> strings1= new ArrayList();
		
		strings1.add("Hello");  // autoboxing 
		strings1.add("world");
					
		String str =strings1.get(0); // no cast is required 
		
		// add() will add String obj , return string obj 
		// type checking is at compilation 
		
		
		// gereics to Iterator 
		
		Iterator<String> it= strings1.iterator();
		while( it.hasNext())
		{
			String str1=it.next();  
			System.out.println(str1);
		}
		
		
		
		
	}

}
