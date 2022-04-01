package com.lti.genericsdemo;

import java.util.ArrayList;

//own class - act as a generic class 
// u can set diff type // parameterized type <T>

public class AddressBook<T> {
	
	private ArrayList<T> data;
	
	AddressBook()
	{
		data= new ArrayList<>();
	}
	
	public void add(T value)
	{
		data.add(value);
	}
	
	public  T get(int index)
	{
		return data.get(index);
	}

	@Override
	public String toString() {
		return "AddressBook [data=" + data + "]";
	}

}
