package Mutlithreading;

public class Thread_dmo extends Thread{

	public void run() {
	try {
		

	for(int i=0;i<6;i++) {
	
		Thread_dmo.sleep(499);
		System.out.println("Hello " +i);
		
	}
	}
	
	catch(Exception e) {
		
		e.printStackTrace();
	}		
}

public static void main(String args[]) {
	
	Thread_dmo d=new Thread_dmo();
	d.start();
}
}

