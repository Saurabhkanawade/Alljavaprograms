
/*public class Mock3 implements Runnable {

	public void run() {
		
		System.out.println("This is an runnable interface");
	}
	
	public static void main(String[] args) {
		
		Mock3 m=new Mock3();
		Thread t=new Thread(m);
		t.start();
	}
*/


/*class Mock3 extends Thread{
	
  public void run() {
	  
	  for(int i=1;i<6;i++) {
		  
	  try {

		Thread.sleep(1000);   
         }
	  catch(Exception e) {
		  
		  System.out.println("Exception is Handled");
	  }
	 System.out.println(i);
	  }
  }
	
	public static void main(String[] args) {
		
		Mock3 m1=new Mock3();
        Mock3 m2=new Mock3();
		m1.start();
		
		try {
			
			m1.join(10);
		}
		catch(Exception e) {
			
			System.out.println("Exception is Handled");
		}
		m2.start();

	}
}

*/

/* class Mock3 extends Thread{
	
	public void run() {
		
		System.out.println("This is Thread");
	}
	public static void main(String[] args) {
		
		
		
		Mock3 m=new Mock3();
		Mock3 m2=new Mock3();
		
		System.out.println("The name of the thread : "+m.getName());
		System.out.println("The id of the thread : "+m.getId());
		System.out.println("The priority of the thread :"+m.getPriority());
		
		m.setPriority(NORM_PRIORITY);
		System.out.println("The priority of the set : "+m.getPriority());
		m.setName("Multithreading");
		System.out.println("the name after the changing the name : "+m.getName());
		
		m.start();
		m2.start();
		
	}
}

*/


class Mock3 extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
		System.out.println("This is daemon thread");
	}
		else {
			
			System.out.println("This is child thread");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		Mock3 m=new Mock3();
		Mock3 m1=new Mock3();
		Mock3 m2=new Mock3();
		
		m.setDaemon(true);
		m.start();
		
		m1.start();
		m2.start();
	}
}


