package inheritance;

public class MultilevelInheritence {

	public static void main(String[] args) {
		PreHome p = new PreHome();
		p.door();
		p.furniture();
		p.television();

	}

}

class Home{
	void furniture(){
		System.out.println("I am calling furniture...");
	}
}

class SubHome extends Home{
	void door(){
		System.out.println("I am calling Door...");
	}
}

class PreHome extends SubHome{
	
		void television(){
			System.out.println("I am calling Television...");
		}
	}
