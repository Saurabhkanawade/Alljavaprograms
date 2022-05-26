package Exception_throw;

public class Demo_throw {

	static void no(int a,int b) {
		
		int addtion =a+b;
		
		if(addtion<18) {
			throw new ArithmeticException("Your addtion is not valid");
		}
		
		else {
			
			System.out.println("welcome to vote cummunity");
		}
	}
	
	public static void main(String[] args) {
		
		try {
		Demo_throw.no(1, 13);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Exception is Handled by AE");
		}
	System.out.println("Rest of the code");
		
	}
	
}
