package com.lti.sortingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserApp {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(102,"jay",500000);
		Employee e2= new Employee(103,"vijay",600000);
		Employee e3= new Employee(101,"sanjay",700000);
		
		
		List<Employee> empList= new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);

		
		Collections.sort(empList,new EmpSortBySal());
		
		System.out.println(empList);
		
		
		
		
	}

}
