package Exception;

public class Nullpointer {

	public static void main(String[] args) {
		
	
	try {
		
		

		
		//String s="sauabh";
		String s=null;
		
		
		System.out.println(s.length());
		System.out.println("Exception occurs");
		
	}
	
	catch(NullPointerException e){
	
	//System.out.println(e);
	System.out.println("Exception Handle");
	
	}

	
	System.out.println("Rest of the code");
	
}
}