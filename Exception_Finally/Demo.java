package Exception_Finally;

public class Demo {
	
	public static void main(String[] args) {
		
try {		
	String n=null;
    
	System.out.println(n.length());
  }

catch(Exception e) {
	
	System.out.println("This is parent Exception");
  }

finally {
	
	System.out.println("THis is finally block");
}

System.out.println("This is the rest of the code");

}
}