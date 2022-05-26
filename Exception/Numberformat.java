package Exception;

public class Numberformat {

	public static void main(String[] args) {
		
	
	try {
		
		
	   String name="saurabh";
       
	  // int s=Integer.parseInt(name);
	   
		System.out.println(name.length());
	}
	
	catch(NumberFormatException e){
	
	System.out.println("This is number format Exception");
}

	System.out.println("rest of the code");
	
}
}