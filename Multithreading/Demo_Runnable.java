package Multithreading;

public class Demo_Runnable implements Runnable{

	public void run() {
		
		System.out.println("This is an Thread using Implementing the Runnalble Class");
	}
	
	 public static void main(String[] args) {

		 Demo_Runnable s=new Demo_Runnable();
		 
		 Thread t=new Thread(s);
		 
		 t.start();
		 
	}
	
	
}
