package Polymorphism;

public class Bike {

	void run() {
		System.out.println("bike is running");
	}
}
	class Splender extends Bike{
		
		void run() {
			
	      	super.run();
			System.out.println("splender is runing");
		}
	}
	
	class Testbike{
		
	
	public static void main(String[] args) {
 
		Bike p=new Splender();
		Splender s=(Splender)p;
		
		s.run();
           
	}

}
