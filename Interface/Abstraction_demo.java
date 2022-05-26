package Interface;

public abstract  class Abstraction_demo {

	
	abstract void run();
	
}

class Demo extends Abstraction_demo{
	
	public void run() {
		
		System.out.println("This is extends method");
	}
	
	public static void main(String[] args) {
		
		
		Demo s=new Demo();
		
		s.run(); 
	}
}