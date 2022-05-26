package Exception_throws;

import java.io.IOException;

public class Checkage {
	
	static void check(int age)throws ArithmeticException{
		
	
		if(age<18) {
			
			throw new ArithmeticException("Not valid age");
		}
		else {
			
			System.out.println("Valid");
		}
	}
	
	public static void main(String[] args) {
		
	 Checkage.check(20);
		
	}

}
