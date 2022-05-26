package String_java;

public class Count {

	public static void main(String[] args) {
	
		
		String s1="Welcome to java";
		
		int count=1;
		
		
	
	  for(int i=1;i<s1.length();i++) {
		  
		  if(s1.charAt(i)!=' ') {
			  
			count++;  
		   }
	  }
	
	  System.out.println(count);
	}
}
	  

	  