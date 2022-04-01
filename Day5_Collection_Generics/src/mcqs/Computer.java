package mcqs;

public class Computer {
	public void startup() {
		System.out.print("computer-");
	}

	public static void main(String[] args) {
		
		Computer computer = new Laptop();
		Laptop laptop = new Laptop();
		computer.startup();
		laptop.startup();
	}
	
}
