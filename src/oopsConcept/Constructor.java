package oopsConcept;

public class Constructor {
	
	public static void Constructor(){
		System.out.println("This is no argument Parameterized constructor");
	}
	
	public Constructor(String name,int age){
		// This constructor has one parameter, name.
	      System.out.println("This is Parameterized constructors  using Passed Name is :" + name + "   Age = "+age);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor();
		Constructor c = new Constructor("Kriyansh",10);
	
	}

}