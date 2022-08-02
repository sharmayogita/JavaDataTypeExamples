package oopsConcept;

public class ObjectClassesConcept {
	int age= 10;
	int a=40;//non static
	public void getValue(){
		System.out.println("This is my method");
	}

	public static void main(String[] args) {
		ObjectClassesConcept oc = new ObjectClassesConcept();
		Student s1 = new Student(101,"Yogita");
		Student s2 = new Student(102,"Saurav",32);
		s1.insertRecord(101, "Yogita");
		s2.insertRecord(102,"Saurav");
		System.out.println(s1.rollno); //using reference variable
		System.out.println(s2.name);
		
		s1.displayInformation();
		
		oc.getValue();
		System.out.println(oc.age);
	}

}
 class Student{
	 int rollno; 
	 int id;
	 int age;
	 String name; 
	 
	 // method overloading
	 Student(int i,String n){
		 this.id = i;  
		 this.name = n;  
	 }
	 Student(int i,String n,int a){
		 id = i;  
		 name = n; 
		 age = a;
	 }
	 
	 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;
	 }
		void displayInformation() { 
		  System.out.println(rollno+" "+name);
		
	 }  
	 
	 
 }
