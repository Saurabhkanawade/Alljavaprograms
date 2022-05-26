package File_handlling;

import java.io.*;

public class Filewriter_bufferwriter {

	public static void main(String[] args) throws IOException{
		
		FileWriter f=new FileWriter("saurabh.txt");
		
		BufferedWriter bout=new BufferedWriter(f);
		
		String s=" Hello my self saurabh";
		
		byte b[]=s.getBytes();
		
		bout.write(s);
		bout.flush();
		bout.close();
		f.close();
		
		System.out.println(" wrote sucessfull ");		
		
	}
}
