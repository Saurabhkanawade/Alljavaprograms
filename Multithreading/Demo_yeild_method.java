package Multithreading;

public class Demo_yeild_method extends Thread {

	public void run() {
		
		System.out.println("run Thread isAlive :"+Thread.currentThread().isAlive());
	}
	
	public static void main(String[] args) {
		
	Demo_yeild_method D=new Demo_yeild_method();
	
    System.out.println("before staring the thread isAlive or not :"+D.isAlive());
	
	D.start();
	
	System.out.println("after staring the thread check isAlive :"+D.isAlive());
	}
}
