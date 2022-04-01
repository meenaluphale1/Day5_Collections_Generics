package com.lti.demo5.annonymous;

//Demo3 :
/*An anonymous inner class is a local inner class that does not have a name.
 *  It is declared and instantiated all in one statement using the new keyword.
Anonymous inner classes are  required to extend an existing class or implement an existing interface. They are useful when 
when you have a short implementation that will not be used anywhere else. */

public class AnonInner1 {
    //Member Inner Class
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
 
    	//Anonomous Inner Class
        SaleTodayOnly sale = new SaleTodayOnly() {
        	
            @Override
            int dollarsOff() {
                return 3;
            }
        };       
        
        return basePrice - sale.dollarsOff();
    }
    
    public static void main(String[] args) {
		
    	AnonInner1 a= new AnonInner1();
    	int result =a.admission(100);
    	System.out.println(result);
	}
}


