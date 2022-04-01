package mcqs;


 class Bird
{
public void fly()
{
System.out.println("Fly");
}
public void dance()
{
System.out.println("Dance Bird ");
}
}
 class Peacock extends Bird
{
public void dance()
{
System.out.println("Dance peac");
}
}
public class TestEx {

	public static void main(String[] args) {
		
		Bird p= new Peacock();		
		
		p.fly();
		p.dance();
		
	}
}
