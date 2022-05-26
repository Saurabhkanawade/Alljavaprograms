package Exception_throws;

public class Demo_trycatch {

  void add() {
	  int a=100/0;
  }
  
	public static void main(String[] args) {
		
	Demo_trycatch D=new Demo_trycatch();
	
	//D.add();
	try {
		
	D.add();
}
	catch(ArithmeticException e) {
		System.out.println("Exception is Handled");
	}
	System.out.println("Rest of the code");

	}
}
