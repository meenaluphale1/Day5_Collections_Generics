package com.lti.demo5.annonymous;
 
public class AnonInner2 {
    interface SaleTodayOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
    	
        SaleTodayOnly sale = new SaleTodayOnly() /*extends Object*/ {        	
        
            @Override
            public int dollarsOff() {
                return 3;
            }
            /**
             * By default, Every Anonymous class is extended by Object class. we
             * cant write extend with Anonymous class
             */
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
            @Override
            public int hashCode() {
                return super.hashCode();
            }
            
        };
        return basePrice - sale.dollarsOff();
    }
    
 public static void main(String[] args) {
		
    	AnonInner2 a= new AnonInner2();
    	int result =a.admission(100);
    	System.out.println(result);
	}
}
