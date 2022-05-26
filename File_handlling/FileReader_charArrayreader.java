package File_handlling;

import java.io.*;
import java.util.*;

public class FileReader_charArrayreader {

	public static void main(String[] args) throws IOException{
		
		char[] b= {65,66,67,68,69,70};
		
		CharArrayReader c=new CharArrayReader(b);
		
		
		int i=0;
		
		while((i=c.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		
		
	}
}
