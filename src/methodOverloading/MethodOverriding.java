package methodOverloading;

public class MethodOverriding extends Vehicle	{

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();  
		  //calling the method with child class instance  
		  obj.run();  

	}

}
class Vehicle{  
	  void run(){
		  System.out.println("Vehicle is running");
		  }  
	} 