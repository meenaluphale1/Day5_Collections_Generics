package mcqs;

public class Employee {
	
	String name;
	boolean contract;
	double salary;
	
	Employee()
	{
		this.name= new String("joe");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", contract=" + contract + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		Employee e= new Employee();
	//	e.name="joe";
	//	e.contract=true;
		//e.salary=100;
	//	
		System.out.print(e);
		System.out.println(e);
		
	}
}



