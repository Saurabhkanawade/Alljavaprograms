package Multithreading;

public class Current_threaddemo extends Thread{
	
	public void run() {

		System.out.println("current Thread : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
	  Current_threaddemo C=new Current_threaddemo();
	
	 
	  C.start();
	  
		 Thread.currentThread().setName("Multithreading");
		  System.out.println("Name :"+Thread.currentThread().getName());
	  

	  
	}
}
