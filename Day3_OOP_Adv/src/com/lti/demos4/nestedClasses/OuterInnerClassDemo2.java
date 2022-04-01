package com.lti.demos4.nestedClasses;

//inner classes  // why ? use of inner classe 

//
//A member inner class is a class defined at the same level as instance variables.
// It is not static. Often, this is just referred to as an inner class without explicitly saying the type.


class PayTax {

	private int empId = 101;
	double amount = 5000.00;
	
	void display()
	{
		PanCard p= new PanCard();
		System.out.println(p.PanNo);
	}

	class PanCard { // inner class
		int PanNo = 12345;
		void show()
		{
			System.out.println(empId);
		}
	}
}

public class OuterInnerClassDemo2 {

	public static void main(String[] args) {
		
		PayTax e = new PayTax();
		
		

		//PayTax.PanCard p = e.new PanCard();
		PayTax.PanCard p = new PayTax().new PanCard();		

		System.out.println(e.empId + " " + e.amount + " " + p.PanNo);

	}
}
