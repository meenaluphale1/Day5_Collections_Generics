package com.lti.sortingex;

import java.util.*;


class Ex5_LinkedList_ListIterator
{
public static void main(String args[])
{
	
	
			LinkedList<String> lst = new  LinkedList<>();
			lst.add("A");
			lst.add("B");
			lst.add("C");
			lst.add("D");		
			lst.add("E");		
			lst.addLast("F");
			lst.addLast("G");
			
			lst.add(1, "A2");
			System.out.println("Original contents of lst: " + lst );
			
			lst.remove("F");
			lst.remove(2);
			System.out.println("Contents of lst after deletion: " + lst);
			lst.removeFirst();
			lst.removeLast();
			System.out.println("lst after deleting first and last: " + lst);
			
			Object val = lst.get(2);
			
			lst.set(2, (String) val + "Changed"); 
			System.out.println("lst after change: " + lst);
			
			LinkedList myList = new LinkedList();
			
			myList.add( "Hello world" );
			myList.add( "Hello world" );
			myList.add( 9769777488l );
			//myList.add( new Book(123441, "Learning Java", "Amit", "IT"));
			//myList.add( new Student(1, "Eric", 12000) );
			
			/*Iterator it = myList.iterator();
			while( it.hasNext() )
			{
				System.out.println( it.next() );
			}*/
			
			ListIterator it1 = myList.listIterator();
			
			while( it1.hasNext() )
			{
				System.out.println( it1.next() );
			}
			
			while( it1.hasPrevious() )
			{
				System.out.println( it1.previous() );
			}
			//Limitations of ListIterator: 
			//applicable for List implemented classes, 
			//so it is not a universal iterator.
			
			}
}














