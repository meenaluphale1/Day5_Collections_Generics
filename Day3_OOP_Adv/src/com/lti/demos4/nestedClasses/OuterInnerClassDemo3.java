package com.lti.demos4.nestedClasses;

import com.lti.demos4.nestedClasses.PayTax.PanCard;

/*
 *1. 
 *A member inner class is a class defined at the same level as instance variables.
 *  It is not static. Often, this is just referred to as an inner class without explicitly saying the type.

2. A static nested class is a static class that is defined at the same level as static
variables

3.  A local inner class is defined within a method. example - AnonInher1
    An anonymous inner class is a special case of a local inner class that does not have a name.
 */

class PayTaxes {
	int empId = 101;

	static class PanCards {		
		//static int i=100;//static variable allowed 
		String OrgName = "PanIndia";		
	}
}
	public class OuterInnerClassDemo3 {
			
		  public static void main(String[] args) 
		  {	
			  //PayTaxes e= new PayTaxes();			  
			  //System.out.println(e.empId);
			  
			 // PayTax.PanCard p = e.new PanCard(); 
			  
			  PayTaxes.PanCards p = new PayTaxes.PanCards();			
			  System.out.println( p.OrgName);
		    
		  }
		  
		}
	
	
	
	
