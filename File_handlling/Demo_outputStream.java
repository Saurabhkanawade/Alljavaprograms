package File_handlling;

import java.util.*;
import java.io.*;

public class Demo_outputStream {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fout=new FileOutputStream("Demo.txt");
		
		String s="this is Example of the file outputStream";
		
		byte b[]=s.getBytes();
		
		fout.write(b);
		
		fout.flush();
		fout.close();
		
		System.out.println("Succesfully wrote into the file Alright !");
	}
}
