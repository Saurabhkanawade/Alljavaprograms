package File_handlling;

import java.io.*;

 abstract class BufferedInputStream2 extends InputStream {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fout=new FileInputStream("saurabh.txt");
		
		BufferedInputStream bout=new BufferedInputStream(fout);
		
		int i=1;
		
		while((i=bout.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		
	}

}
