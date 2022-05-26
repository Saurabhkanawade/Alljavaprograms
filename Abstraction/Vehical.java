package Abstraction;

public abstract class Vehical {

	Vehical(){
		
		System.out.println("this is vehical constructor");
	}
	
	abstract void speed();
	
	{
		System.out.println("this is anonymous block");
	}
	
	
	static{
		System.out.println("this is static block");
	}
	
	void doc() {
		System.out.println("this is doc method");
	}
	
}

 class Mahindra extends Vehical{
	
	void speed() {
	
		System.out.println("the speed of an vehical");
	}
	
	
	static int milage(int a) {
	
		 return a;
	}
}

class Testcar{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Mahindra s=new Mahindra();
	
	s.speed();
   
	System.out.println(Mahindra.milage(250));
	
	}

}
//instance