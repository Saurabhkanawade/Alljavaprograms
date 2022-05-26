package Abstraction;

public abstract class Mahindraa {
	
	abstract void run();
}

class Thar extends Mahindraa{
	
	void run() {
		
		System.out.println("This is run method");
	}
	
	public static void main(String[] args) {
		
		Thar t=new Thar();
		t.run();
	}
}
