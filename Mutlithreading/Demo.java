package Mutlithreading;

public class Demo extends Thread{
	
	public void run() {
		 
		for(int i=1;i<7;i++) {
			
			try {
				
				Thread.sleep(500);
			}
			catch(Exception e) {
			System.out.println("Excepetion is handled");	
			}
			
			System.out.println(i);
			}
		}
	
	public static void main(String[] args) {
		
		Demo s=new Demo();
		
		s.start();
		
	}

}
