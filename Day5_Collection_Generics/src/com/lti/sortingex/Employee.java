package com.lti.sortingex;

public class Employee implements Comparable<Employee>{  // natural sorting 
	
	int empId;
	String empName;
	double empSal;		
	
	@Override
	public int compareTo(Employee o) {	
		
		 if (o.getEmpId() == this.getEmpId())
         {
             return 0;
         } 
         else if (o.getEmpId() < this.getEmpId()) 
         {
             return 1;
         }
         else 
         {
             return -1;
         }		
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return " \n Employee  [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	

}
