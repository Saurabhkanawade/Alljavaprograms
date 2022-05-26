package Multithreading;

public class Demo_isDaemon extends Thread{

	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("Daemon Thread work");
		}
		else {
			
			System.out.println("User check");
		}
	}
public static void main(String[] args) {
	
	Demo_isDaemon D1=new Demo_isDaemon();
	Demo_isDaemon D2=new Demo_isDaemon();
	Demo_isDaemon D3=new Demo_isDaemon();
	
	D1.setDaemon(true);
	
	D1.start();
	D2.start();
	D3.start();
}
}