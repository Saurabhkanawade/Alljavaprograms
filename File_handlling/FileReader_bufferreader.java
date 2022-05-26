package File_handlling;

import java.io.*;
import java.util.*;

public class FileReader_bufferreader {
	
	public static void main(String[] args) throws IOException{
		
		FileReader f=new FileReader("saurabh.txt");
		
		BufferedReader bout=new BufferedReader(f);
		
		int i=0;
		
		while((i=bout.read())!=-1) {
			
			char data=(char)i;
			
	         System.out.print((char)i);

		}
		
		
	}

}
