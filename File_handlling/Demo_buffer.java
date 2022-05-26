package File_handlling;

import java.io.*;


public class Demo_buffer {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream f=new FileOutputStream("Demo.txt");
		
		BufferedOutputStream fout=new BufferedOutputStream(f);
		
		String s="Hello guys this is example of the buffered outputStream";
		
		byte b[]=s.getBytes();
		
		fout.write(b);
		
		fout.flush();
		fout.close();
		
		System.out.println("Done");
	}
	
}
