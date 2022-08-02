package inheritance;

public class SingleInheritance {

	public static void main(String args[]) {
		Child c = new Child();
		c.play();
		c.call();

	}
}
class Parent{  
	void call(){
		System.out.println("calling...");
	}  
}  
class Child extends Parent{  
	void play(){
		System.out.println("playing..."); 
	}
}

