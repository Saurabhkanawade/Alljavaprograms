package File_handlling;

import java.io.*;

public class BufferedOutputStream2 {
	
public static void main(String[] args) throws IOException {
	
	FileOutputStream fout =new FileOutputStream("saurabh.txt");
	
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	
	String s=" Hello this is an buffered output stream";
	
	byte b[]=s.getBytes();
	
	bout.write(b);
	
	bout.flush();
	bout.close();
	
	System.out.println(" Wrote successfully");
}
}
