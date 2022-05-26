package Exception_Nested_try_block;

public class Nested_all {
	

	public static void main(String[] args) {
		
		try {
			
		int a=200/50;
		        System.out.println("This is error");
			   try {
				   
				   String s=null;
				   System.out.println("This is length"+s.length());
				   System.out.println("This is null");
			   }
			   catch(ArithmeticException e) {
				   System.out.println("Exception is handled by an AE");
			   }
			   catch(NullPointerException e) {
				   System.out.println("Exception is handled by Null");
			   }
			   catch(ArrayIndexOutOfBoundsException e) {
				   System.out.println("This is an Array Exception");
			   }
  		}
		
	catch(NullPointerException e) {
		
		System.out.println("This is parent Exception");
	}
			   
	System.out.println("This is an rest of the code");
}
}
