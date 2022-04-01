package com.lti.maps;

import java.util.HashMap;
import java.util.Map;

import com.lti.sortingex.Employee;

public class MapsDemo {
	
	public static void main(String[] args) {
		
		//key(unique)  value
		
		Map<String,String>  mailIds=  new HashMap<String,String>();
		
		mailIds.put("user1@gmail.com","password1");
		mailIds.put("user2@gmail.com","password2");
		mailIds.put("user1@gmail.com","password3");
		
		System.out.println(mailIds);
		
		// maps are not a part of collection interface hierarchy 
		//Iterable interable is not avail for maps directly 
		// convert map to Set first -Using EntrySet  and the user Iterator 
		
		//	//Map.keySet() method returns a Set view of the keys 
		// Map.values() method returns a collection-view of the values 
		for( Map.Entry<String,String> entry : mailIds.entrySet())
		{
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		//Map<Integer,Product> empMap = new HashMap<Integer,Product>();
		Employee e1= new Employee(102,"jay",500000);
		Employee e2= new Employee(103,"vijay",600000);
		Employee e3= new Employee(101,"sanjay",700000);
		
		Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
		empMap.put(101,e1 );
		empMap.put(102,e2 );
		empMap.put(103,e3 );
		
		for( Map.Entry<Integer,Employee> entry : empMap.entrySet())
		{			
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
