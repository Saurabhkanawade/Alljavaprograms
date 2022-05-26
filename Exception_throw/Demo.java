package Exception_throw;

class Demo{
	
	static void validate(int age) {
       
		if(age<18) {
    	   
    	throw new ArithmeticException("NOt valid Age");
        }
		
		else {
			
			System.out.println("Welcome , You are able to vote");
		}
	}
	
	public static void main(String[] args) {
		
		Demo.validate(20);
		
      System.out.println("Rest of the code");		
	
	
}
}