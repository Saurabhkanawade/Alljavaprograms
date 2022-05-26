package Multithreading;

public class Demo_priority extends Thread{
	
	public void run() {
		
		System.out.println("Checking The priority of the thread");
	}

	public static void main(String[] args) {
		
		Demo_priority D1=new Demo_priority();
		Demo_priority D2=new Demo_priority();
		Demo_priority D3=new Demo_priority();
	
		

		System.out.println("The priority of the thread 1 is :"+D1.getPriority());
		System.out.println("The priority of the thread 2 is :"+D2.getPriority());
		System.out.println("The priority of the thread 3 is :"+D3.getPriority());
		
		D1.setPriority(3);
		D2.setPriority(2);
		D3.setPriority(6);
		
		System.out.println();

		System.out.println("The priority of the thread 1 is :"+D1.getPriority());
		System.out.println("The priority of the thread 2 is :"+D2.getPriority());
		System.out.println("The priority of the thread 3 is :"+D3.getPriority());
		
		
		System.out.println("The priority of the current thread is :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		
		System.out.println("The priority of the current thread is :"+Thread.currentThread().getPriority());
		
		
		D1.start();

	}
}
