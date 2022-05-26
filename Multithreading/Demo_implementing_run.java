package Multithreading;

public class Demo_implementing_run implements Runnable {
	
	public void run() {
		
		System.out.println("This is runnable Thread");
	}
	
	public static void main(String[] args) {
	
		Demo_implementing_run D1=new Demo_implementing_run();
		Thread T=new Thread(D1,"Hello World");
		
		T.start();
		
		String s=T.getName();
		System.out.println(""+s);
		
	}

}
