package mcqs;

interface HasExoskeleton {
	abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
	abstract int getNumberOfLegs();
}

 class Beetle extends Insect { int getNumberOfLegs() { return 6; }

@Override
public int getNumberOfSections() {
	// TODO Auto-generated method stub
	return 0;
} }
  
 

public class IceCream {
	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY
	}

	public static void main(String[] args) {
	 Flavors f = Flavors.STRAWBERRY;
	 switch (f) {
	 case 0: System.out.println("vanilla");
	 case 1: System.out.println("chocolate");
	 case 2: System.out.println("strawberry");
	 break;
	 default: System.out.println("missing flavor");
	 } 
	 }
