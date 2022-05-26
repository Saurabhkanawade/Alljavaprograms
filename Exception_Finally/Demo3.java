package Exception_Finally;

public class Demo3 {

	public static void main(String[] args) {
	
		try {
			
			int a=50/2;
			
			System.out.println(a);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("statment 1");
		}
		
		finally {
			
			System.out.println("This is finally block");
		}
    
		System.out.println("This is rest the code");
	
	}
   }
