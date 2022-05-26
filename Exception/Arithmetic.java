package Exception;

public class Arithmetic {

	public static void main(String[] args) {
		
	
	try {
		
		
		int data=100/5;
				
		
		
		System.out.println("this is code");
		
		
		}
	
	catch(ArithmeticException e){
	
	System.out.println(e);
	System.out.println("you cant divide by 0");
}
	
	System.out.println("Exception Handled");
		
}
}