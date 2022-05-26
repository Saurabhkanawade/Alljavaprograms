package File_handlling;

import java.io.*;

public class ByteArrayInputStream2 {
	
	public static void main(String[] args) throws Exception {
		
		byte[] Array= {65,66,67,68,69,70};
		
		ByteArrayInputStream bout=new ByteArrayInputStream(Array);
		
		
		
		int i=1;
		
		while((i=bout.read())!=-1){
			
			char ch=(char)i;
			System.out.println(" The Ascii value of Char : " +ch+ " is : "+i);
		}
	
		
	}

}
