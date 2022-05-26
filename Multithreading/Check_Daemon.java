package Multithreading;

public class Check_Daemon extends Thread{
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("This is Daemon Thread");
		}
		
		else {
			
			System.out.println("This is child class");
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("This is main thread");
		Check_Daemon d=new Check_Daemon();
	
		d.setDaemon(true);
	     d.start();
	}

}
