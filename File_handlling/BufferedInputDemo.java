package File_handlling;

import java.io.*;

public class BufferedInputDemo {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("java.txt");
		BufferedInputStream fout=new BufferedInputStream(f);
		
		int i;
		
		while((i=fout.read())!=-1){
			
			System.out.print((char)i);
			
		}
		
	}
}
