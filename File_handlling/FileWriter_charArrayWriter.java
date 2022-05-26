package File_handlling;

import java.io.*;

public class FileWriter_charArrayWriter {

	public static void main(String[] args) throws IOException{
	
		CharArrayWriter c=new CharArrayWriter();
		
   		c.write(" This is Char Array Writer Stream");
   		 
   		
 		
 		FileWriter f=new FileWriter("a.txt");
 		FileWriter f1=new FileWriter("b.txt");
 		FileWriter f2=new FileWriter("c.txt");
 		FileWriter f3=new FileWriter("d.txt");
		
 		c.writeTo(f);
 		c.writeTo(f1);
 		c.writeTo(f2);
 		c.writeTo(f3);
 		
 	    f.close();
 	    f2.close();
 	    f3.close();
 	    f1.close();
 	    
 		
 		System.out.println(" Done ");
	}
}
