package File_handlling;

import java.io.*;

public class Demo_byteArray {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream f=new FileOutputStream("Demo.txt");
		FileOutputStream f1=new FileOutputStream("Saurabh.txt");
	
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		
		String s=" Hello guys my name is saurabh and this is the Example of the Byte Array OutoutStream";
		byte b[]=s.getBytes();
		
		bout.write(b);
		bout.writeTo(f);
		bout.writeTo(f1);
		
		bout.flush();
		bout.close();
		
		System.out.println("Done");
	}
}
