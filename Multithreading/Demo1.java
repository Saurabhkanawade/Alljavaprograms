package Multithreading;

public class Demo1 extends Thread {

	public void run() {
		
		System.out.println("This is an run thread");

	}


	public static void main(String[] args) {

		Demo1 s=new Demo1();
	
		s.start();
	}
}
