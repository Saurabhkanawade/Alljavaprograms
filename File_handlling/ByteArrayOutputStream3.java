package File_handlling;

import java.io.*;

public class ByteArrayOutputStream3 {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\saura\\eclipse-workspace\\Saurabh\\saurabh1.txt");
		FileOutputStream fout2=new FileOutputStream("C:\\Users\\saura\\eclipse-workspace\\Saurabh\\saurabh.txt");

		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		
		String s=" Hello this is example of the byteArrayOutputstrem";
		
		byte b[]=s.getBytes();
		
		bout.write(b);
		bout.writeTo(fout);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();
		
		
		System.out.println(" Wrote successfully ");
	}
}
