package FileHandlling_practice;

import java.io.*;

public class ByteArrayInputStream4 {

	public static void main(String[] args) throws Exception{
		
		byte[] b= {75,68,87,76,96,96,54,68};
		
		ByteArrayInputStream v=new ByteArrayInputStream(b);
		
		int i=0;
		
		while((i=v.read())!=-1) {
			
			char ch=(char)i;
			
			System.out.println(ch+" "+i);
		}
	}
}
