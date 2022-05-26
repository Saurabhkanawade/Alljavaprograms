package Multithreading;

public class Demo_getset extends Thread{
	
	public Demo_getset(String name) {
		
		super(name);
	
}
	
	public void run() {
		
		System.out.println("This is run Thread");
	}

	public static void main(String[] args) {
		
		Demo_getset D=new Demo_getset("Hello constructor");
		
				
			D.start();
			
			System.out.println(D.getName());
	}			
}

