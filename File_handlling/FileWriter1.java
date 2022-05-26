package File_handlling;

import java.io.*;

public class FileWriter1 {
	public static void main(String[] args) throws IOException{
		
		FileWriter f=new FileWriter("saurabh.txt");
		
		f.write(" Hello guys my name is saurabh ");
		
		f.flush();
		f.close();
		
		System.out.println(" Wrote Successfully ");
	}
}
