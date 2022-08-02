package Interface;

public class InterfaceInheritance implements ClassA, ClassB {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void call(){
		System.out.println("calling..");
	}
	public static void main(String args[]) {
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.print();
		obj.show();
		call();
	}
}

interface ClassA {
	void print();
}

interface ClassB extends ClassA {
	void show();
}