package Multithreading;

public class Demo4 extends Thread {

public void run() {
	
	for(int i=0;i<10;i++) {
		
		try {
			
			Thread.sleep(1500);
		}
		catch(Exception e) {
			
			System.out.println("This Exception is Handled");
		}
		
		System.out.println(i);
	}
}
	
	
	public static void main(String[] args) {
		
		
		Demo4 s1=new Demo4();

		Demo4 s2=new Demo4();
	
	   
		s1.start();
		s2.start();
	}
}
