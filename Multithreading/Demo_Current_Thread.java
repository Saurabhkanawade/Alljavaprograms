package Multithreading;

public class Demo_Current_Thread extends Thread{

	public void run() {
		
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());
		
		//Thread.currentThread().setName("Multi");
		
		System.out.println("After changing the Thread name : "+Thread.currentThread().getName());
		
		
		System.out.println("The id is   : "+Thread.currentThread().getId());
		
		
	}
	
	public static void main(String[] args) {
		
		Demo_Current_Thread d1=new Demo_Current_Thread();
		Demo_Current_Thread d2=new Demo_Current_Thread();
		
		
	  d1.setName("multithreading");
	  d2.setName("Multiprocessing");
	   
	
		d1.start();
		
		d2.start();
		
	}
	
}
