package mcqs;

public class Matrix {  private int level = 1;

class Deep {   private int level = 2;
    
class Deeper {
      private int level = 5;
          public void printReality() {
          System.out.print(level);  // 5
          System.out.print(" "+Matrix.Deep.this.level); // 2
            System.out.print(" "+Deep.this.level); // 2
}
}}
public static void main(String[] bots) {
	
Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();

simulation.printReality();

}}
