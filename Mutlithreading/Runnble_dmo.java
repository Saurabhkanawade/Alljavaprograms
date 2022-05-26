package Mutlithreading;

public class Runnble_dmo implements Runnable{
	
	public void run() {
		
		try {
			
			for(int i=0;i<6;i++) {
				
				Thread.sleep(499);
				System.out.println("Hello "+i);
			}
		}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
	
	public static void main(String[] args) {
		
	Runnble_dmo d=new Runnble_dmo();
	Thread t=new Thread(d);
	
	t.start();
	
	
	}

}
