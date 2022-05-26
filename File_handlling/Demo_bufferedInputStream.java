package File_handlling;

import java.util.*;
import java.io.*;

public class Demo_bufferedInputStream {

	public static void main(String[] args)throws Exception {
		
		FileInputStream f=new FileInputStream("Demo.txt");
		
		BufferedInputStream bout=new BufferedInputStream(f);
		
		Scanner s=new Scanner(bout);
		
		while(s.hasNext()) {
			
			String data=s.next();
			System.out.print(" "+data);
		}
		
	 int i;
	 
		while((i=bout.read())!=-1) {
			
			System.out.print((char)i);
		}
	}
}
