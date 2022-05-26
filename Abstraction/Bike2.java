package Abstraction;

abstract class Bike2 {

	Bike2(){
	
	System.out.println("This is bike constructor");
	
	}
	
	abstract void run();
	
	void speed() {
		System.out.println("This is speed method");
	}
	
 }

 class Splender2 extends Bike2{
	
	void run() {
		System.out.println("Bike is running");
	}
	
}

class TestRun{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Bike2 b=new Splender2();
          
          b.run();
          b.speed();
		
	}

}
