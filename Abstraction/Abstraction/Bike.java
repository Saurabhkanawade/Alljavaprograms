package Abstraction;

public abstract class Bike {

	abstract void run();
	
  }
class Splender extends Bike{
	
	void run() {
		System.out.println("Bike is running");
	}
}
class Testbike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Splender  b=new Splender();
		b.run();
		
	}

}
