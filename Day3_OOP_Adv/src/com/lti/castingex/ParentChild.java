package com.lti.castingex;

/*
1.Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2. Casting an object from a superclass to a subclass requires an explicit cast.
3. The compiler will not allow casts to unrelated types.
4. Even when the code compiles without issue, an exception may be thrown at runtime if 
the object being cast is not actually an instance of that class.*/


class Parent 
{
	int property = 999999;	
	  int sal=10000;	
	void shopping() 
	{
		System.out.println("parent card money :" + property +"sal " +sal);
	}
}
class Child extends Parent 
{	
	@Override
	void shopping() 
	{
		System.out.println("shopping via sal :" + sal + " via property also " + property);
	}
	
	public void show()
	{
		System.out.println(" only child class method  ");
	}
	
}

class GransChild extends Child
{
	
	@Override
	void shopping() 
	{
		System.out.println("shopping via sal :" + sal + " via property also " + property);
	}
}


public class ParentChild {
	public static void main(String[] args) {		
		
		Parent p = new Child();// upcasting		
		p.shopping();	
			
		System.out.println("\n");	
		
		((Child) p).show();		// downcasting 	
		
		Child c2 = (Child) p;// downcasting  via parent class ref  
		c2.show();
		
	//	Child c= new Parent();// direct downcasting not possible with parent object 
		
			
			// Child c = (Child) p; 	// or  
	//		 Child c1 = (Child) new Parent(); 	 
		
		
	
			 
	}
}
		
