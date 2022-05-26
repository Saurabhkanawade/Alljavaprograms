package This;

public class Demo2 {
	
	Demo2(){
		
	}
	
	void display() {
		
		System.out.println("this is a display method");
	}
	
	void run() {
		
		System.out.println("this is a run method");
	   display();
	}
	
   class Testdemo{
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Demo2 s=new Demo2();
	
	s.run();
	
	
	}

}
