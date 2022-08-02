package methodOverloading;

public class MethodOverloading {
	void sum(int a,long b){
		System.out.println(a+b);
		}
	
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));
		MethodOverloading m = new MethodOverloading();
		m.sum(20, 20);
	}

}

class Adder{  
static int add(int a,int b){
	return a+b;
	}  
static int add(int a,int b,int c){
	return a+b+c;
	}

}  

