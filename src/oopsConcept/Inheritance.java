package oopsConcept;

import oopsConcept.Calculation;

public class Inheritance extends Calculation{
	
	int num = 10;
	// display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }

	public void my_method() {
	      // Instantiating subclass
		
	      Calculation cal = new Calculation();
	   // Invoking the display() method of sub class
	     
	      cal.addition(10, 20);
	      cal.Subtraction(20, 10);
	   // Invoking the display() method of Calculation
	      super.display();
	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }
	
	public static void main(String [] args){
		Inheritance i =new Inheritance();
		 i.display();
		 i.my_method();
 
		// printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ i.num);
	      
	    Animal d=new Animal();   
	  	d.eat(); 
	}
	
}

// multilevel inheritance
	class Animal extends Calculation{  
	void eat(){
		System.out.println("eating...");}  
	}  
	
	 




