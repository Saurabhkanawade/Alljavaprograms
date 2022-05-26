package Multithreading;

public class demo12 extends Thread{
	public void run() {
		System.out.println("the current Thread is :"+Thread.currentThread().getName());
		Thread.currentThread().setName("multithreading");
		System.out.println("the id of thread  is :"+Thread.currentThread().getId());
		System.out.println("after change of Thread name : "+Thread.currentThread().getName());
	}
	
public static void main(String[] args) {
	demo12 t=new demo12();
	demo12 t1=new demo12();
	t.start();
	t1.start();
}
}
