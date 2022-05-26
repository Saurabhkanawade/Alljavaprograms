package Interface;

public interface Runnable {

  void run();

}

 interface Printable7{
	
	void print();
}
 
 class Display6 implements Runnable , Printable7{
	 
	public void run() {
		 
		 System.out.println("This is run methos");
	 }
	
	public void print() {
		
		System.out.println("This is print method");
		
		}
	
	public static void main(String[] args) {
		
		
		Display6 s=new Display6 ();
		s.run();
		s.print();
		
	}
 }


