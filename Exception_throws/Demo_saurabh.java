package Exception_throws;

public class Demo_saurabh extends Exception{
	
	Demo_saurabh(String s) {
		
		super(s);
	}
}

 class Demo_display{
		
		static void method(int age) throws Demo_saurabh{
			
			if(age<18) {
				
			throw new Demo_saurabh("your age is not valid");
		}
		else {
			System.out.println("You are allow to vote");
		}
	
		}
	
	public static void main(String[] args) {
		
		 Demo_saurabh D=new Demo_saurabh("hello");
	
	try {
		Demo_display.method(4);
	}
	catch(Demo_saurabh e) {
		
		System.out.println("Hello exception is handled"+e);
	}
	
	System.out.println("Rest of the code");
		
	}
}
