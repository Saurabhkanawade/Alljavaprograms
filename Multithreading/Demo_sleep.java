package Multithreading;

public class Demo_sleep extends Thread{

	public void run() {
		
		for(int i=1;i<11;i++) {
			
		try {	
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			
			System.out.println("Exception is Handled ");
		}
		
		System.out.println(""+i);
	}
}
	public static void main(String[] args) {
	
		Demo_sleep D=new Demo_sleep();
		
		
		D.start();
	}
}
