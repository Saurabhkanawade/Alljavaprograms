package File_handlling;

import java.io.*;

public class Demo_delete {

	public static void main(String[] args) throws Exception{
		
		File f=new File("java.txt");
		
		if(f.delete()) {
			
			System.out.println("File is Deleted");
		}
		else {
			System.out.println(" File is not found");
		}
	}
}
