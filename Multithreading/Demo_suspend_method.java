package Multithreading;

public class Demo_suspend_method extends Thread{
	
	public void run() {
		
		System.out.println("This is run Thread");
	}

	public static void main(String[] args) {
		
		Demo_suspend_method D1=new Demo_suspend_method();
		Demo_suspend_method D2=new Demo_suspend_method();
		Demo_suspend_method D3=new Demo_suspend_method();
		Demo_suspend_method D4=new Demo_suspend_method();
			

		D1.start();
	    D2.start();
	    D3.start();
	    D4.start();
	    
	    D2.suspend();
	    D2.resume();
	    
	    
	}
}
