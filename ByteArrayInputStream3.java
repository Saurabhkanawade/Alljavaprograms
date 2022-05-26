
import java.io.*;

public abstract class ByteArrayInputStream3{

	public static void main(String[] args) throws Exception {
	
    byte b[]= {65,66,67,78,79,70,71,72};
    
 	ByteArrayInputStream bout=new ByteArrayInputStream(b);
 	
 	
 	int i=0;
 	
 	while((i=bout.read())!=-1) {
 		
 		char ch=(char)i;
 	System.out.println(" The ASCII value of the character  "+ch+" and its value is :  "+i);
}
	
}	
}
