package File_handlling;

import java.io.*;

public class ByteArrayInputStream_char_int {

	public static void main(String[] args) throws Exception{
		
		byte[] data= {'A','B','C','D','E'};
		
		ByteArrayInputStream bout=new ByteArrayInputStream(data);

		int i=0;
		
		while((i=bout.read())!=-1) {
			
         char value=(char) i;
         
			System.out.println(" The Value of the Characters : "+i+" is :"+value);
		}
		
	}
}
