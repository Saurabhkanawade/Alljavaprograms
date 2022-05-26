package File_handlling;

import java.io.*;
import java.util.*;

public class FileReader1_readmethod {

	public static void main(String[] args) throws IOException{
		
		
		FileReader s=new FileReader("saurabh.txt");
		
		int i=0;
		
		while((i=s.read())>=1) {
			
			System.out.print((char)i);
			
		}
	}
}
