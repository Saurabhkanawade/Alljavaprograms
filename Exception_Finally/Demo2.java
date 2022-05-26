
package Exception_Finally;

public class Demo2 {
	
	public static void main(String[] args) {
		
try {		
	String n=null;
    
	System.out.println(n.length());
  }

catch(ArithmeticException e) {
	
	System.out.println("This is parent Exception");
  }

finally {
	
	System.out.println("This is finally block");
}

System.out.println("This is the rest of the code");

}
}