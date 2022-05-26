package Multithreading;

public class Demo5_join extends Thread{
	
	public void run() {
		
		for(int i=1;i<6;i++) {
			
			try {
				
				Thread.sleep(500);
			}
			
			catch(Exception e) {
				
				System.out.println("Exception is Handled");
			}
			
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	
	Demo5_join d1=new Demo5_join();
	Demo5_join d2=new Demo5_join();
	Demo5_join d3=new Demo5_join();
	
	
	d1.start();
	
	try {
		
		d1.join(1000);
		
	}
	
	catch(Exception e) {
		
		System.out.println("Exception is Handled");
	}
	
	//System.out.println();
	
	d2.start();
	//d3.start();
}

}
