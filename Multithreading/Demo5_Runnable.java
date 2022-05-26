package Multithreading;

public class Demo5_Runnable implements Runnable{
	
	public void run() {
		
		for(int i=1;i<5;i++) {
			
			try {
				
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println("Exception is Handle");
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		
		Demo5_Runnable r=new Demo5_Runnable();
		Demo5_Runnable r1=new Demo5_Runnable();
		
	   
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		
		t1.start();
		t2.start();
		
	
		
		
	}

}
