package Multithreading;

public class Demo_Deamon extends Thread{
	
	public void run() {
		
		System.out.println("Check is Thread is Daemon or Not : "+Thread.currentThread().isDaemon());
		System.out.println("This is child thread");
	}

	public static void main(String[] args) {
		
		System.out.println("This is Main thread");
		
		
		Demo_Deamon D=new Demo_Deamon();
		D.setDaemon(true);
		
		D.start();
		
	}
}
