package Multithreading;

public class Demo2_Thread_Priority implements Runnable {

	public void run() {
		
		System.out.println("This is Runnable Thread Name     : "+Thread.currentThread().getName());
		
		System.out.println("This is Runnable Thread Priority : "+Thread.currentThread().getPriority());
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Demo2_Thread_Priority D1=new Demo2_Thread_Priority();
		
		Thread T1=new Thread(D1,"Thread One");
		Thread T2=new Thread(D1,"Thread Two");
		Thread T3=new Thread(D1,"Thread Three");
		
		T1.setPriority(1);
		T2.setPriority(2);
		T3.setPriority(3);
		
		T1.start();
    	T2.start();
	    T3.start();	
	}
	
}
