package com.lti.genericsdemo;

public class TestAddressBook {
	
	public static void main(String[] args) {
		
		
		AddressBook<String> addList= new AddressBook<>();		
		
		addList.add("mumbai");
		addList.add("delhi");
		addList.add("pune");
		
		System.out.println(addList);
		
		String add=addList.get(1);
		System.out.println(add);
		
		
		
		AddressBook<Integer> phoneList= new AddressBook<>();
		
		phoneList.add(123345);
		phoneList.add(123345);
		phoneList.add(123345);
		phoneList.add(123345);
		//phoneList.add("asdsad");
		
		System.out.println(phoneList);
		
		
		
	}

}
