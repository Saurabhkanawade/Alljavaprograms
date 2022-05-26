package Exception_throw;

public class Demo2 {

	
	static int add(int num1 ,int num2) {
		
		if(num1==0 || num2==0) {
			
			throw new ArithmeticException ("Not Valid Number");
		}
		
		else {
			System.out.println("No is Valid");
			
			return num1+num2;
			
		}
	}
	public static void main(String[] args) {

		int res=Demo2.add(2, 7);
	
		System.out.println(res);
		
		System.out.println("Rest of the code");
	}
	}
