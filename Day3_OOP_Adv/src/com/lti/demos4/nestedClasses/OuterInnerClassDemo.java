package com.lti.demos4.nestedClasses;

class OuterClass {
	int x = 10;

	static class InnerClass {
		
		static int i=100; //static not allowed 
		int x = 5;
	}
}
	public class OuterInnerClassDemo {
			
		  public static void main(String[] args) 
		  {	 	  
		 //  OuterClass myOuter = new OuterClass();
		 //   OuterClass.InnerClass myInner = myOuter.new InnerClass();
		 //  System.out.println(myInner.x + " " + myOuter.x);
		    
		   OuterClass.InnerClass obj= new OuterClass.InnerClass();
		  System.out.println(obj.x + " " +obj.i);
		    
		  }
		}

	// Inner is a member inner class.
	//Inner classes are not allowed to contain static methods or static variables.
	//Only nested static classes are permitted to contain static varibales .