package ArryLIstEg;

import ArryLIstEg.Interface.Animal;

public class InterfaceImp implements Animal{

	@Override
	public void eat() {
		System.out.println("eat interface method is calling");
		
	}

	@Override
	public void travel() {
		System.out.println("travel interface method is calling");
		
	}
	
	public void getCallInterface(){
		System.out.println("getCallInterface method is calling");
	}
	
	public static void main(String[] args){
		InterfaceImp inrface = new InterfaceImp();
		inrface.eat();
		inrface.travel();
		inrface.getCallInterface();
	}

}
