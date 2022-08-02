package oopsConcept;

public class Calculation {
	int z;
	int num = 20;
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	   public void display() {
		      System.out.println("This is the display method of superclass");
		   }
}
