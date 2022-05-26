package Exception;

public class Demo2 {
public static void main(String[] args) {
	
	try {
		
		int data=50/0;
		System.out.println("Exception not occurs");
	}
	
	catch(ArithmeticException e) {
		
		System.out.println("WE Cant write this ");
		
		
	}
	System.out.println("Rest of the code");
			
}
	
}
