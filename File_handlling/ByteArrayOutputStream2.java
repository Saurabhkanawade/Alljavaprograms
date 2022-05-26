package File_handlling;

import java.io.*;

public class ByteArrayOutputStream2 {
	
	public static void main(String[] args) throws IOException {

	FileOutputStream fout=new FileOutputStream("saurabh.txt");
	FileOutputStream fout2=new FileOutputStream("saurabh2.txt");
	
	ByteArrayOutputStream bout=new ByteArrayOutputStream();
	
	String s=" Hello this is an Byte Array Output Stream";
	
	byte b[]=s.getBytes();
	
	bout.write(b);
	bout.writeTo(fout);
	bout.writeTo(fout2);
	
	bout.close();
System.out.println("Done");
}
}