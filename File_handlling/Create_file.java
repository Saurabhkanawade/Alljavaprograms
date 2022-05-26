package File_handlling;

import java.io.*;

public class Create_file {

	public static void main(String[] args) throws Exception {
		
		File f=new File("Demo.txt");
		
		if(f.createNewFile()) {
			
			System.out.println("The file is created :"+f.getName());
		}

		else {
			
			System.out.println("File is already exist !");
		}
		
	}
	
}
