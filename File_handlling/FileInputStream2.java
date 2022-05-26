package File_handlling;

import java.io.*;

public abstract class FileInputStream2 extends InputStream{

public static void main(String[] args) {
	

	try {
		
		
		FileInputStream f=new FileInputStream("saurabh.txt");
		
		int i=0;
		
		while((i=f.read())!=-1) {
			
			System.out.print((char)i);
		}
	}
	
	catch(Exception e) {
		
		e.printStackTrace();
		System.out.println(" File is not founds ");
	}
}
}