package Multithreading;

public class Demo3 extends Thread{

	  public void run() {
		 
		 for(int i=0;i<5;i++) {
			 
		try {
			
			Thread.sleep(500);
		 
		   }
		
		catch(Exception e) {
			
			System.out.println(" Exception is Handled"+e);
		}
		
		 System.out.println("This is an Thread : "+i);
		    
	}
}
	 
	public static void main(String[] args) {

     Demo3 d1=new Demo3();
     Demo3 d2=new Demo3();
     
     
     d1.start();
     
     try {
    	 d1.join();
    	 
       }
     
     catch(Exception e) {
    	 
    	 System.out.println(e);
     }
     
	 d2.start();
}
}

