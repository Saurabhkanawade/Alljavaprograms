package String_java;

public class Palindrone {

	
	public static void main(String[] args) {
		
	    int i,j;
	    
	    String n="nitin";
		
	    String rev="";
	
	    for( i=n.length()-1;i>=0;i--)
	   
	   
	    rev= rev+n.charAt(i);
	    { 
	    
      if(n.equals(rev)) {
    	
    	   System.out.println("The String is Palindrone"); 
       }
       else {
    	   
    	   System.out.println("The String is not Palindrone");
       }
	   
}		
}
}
