package Multithreading;

public class Demo_Thread_current extends Thread{

	public void run() {
		
		System.out.println("The name of the thead :"+Thread.currentThread().getName());
		Thread.currentThread().setName("Multithreading");
		
		System.out.println("The name of the id is  :"+Thread.currentThread().getId());
		System.out.println("The name of the thread after the setName :"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Demo_Thread_current d1=new Demo_Thread_current();
		Demo_Thread_current d2=new Demo_Thread_current();
		
		d1.start();
		d2.start();
	}
}
