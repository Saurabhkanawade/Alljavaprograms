package Exception_throws;

public class Demo_throws {

	public void m() throws ArithmeticException{
		
		throw new ArithmeticException("Here is an Exception ");
	}
	
	public void p() throws ArithmeticException{
		m();
	}
	public void n() {
		
		try {
			p();
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
	}
	
	public static void main(String[] args) {
		
		Demo_throws D=new Demo_throws();
		D.n();
		
		System.out.println("rest of the code");

	}
}
