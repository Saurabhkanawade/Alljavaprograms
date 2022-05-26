package File_handlling;

import java.io.*;

public class Createfile_demo {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\saura\\Desktop\\My Files\\java.txt");
		
		if (f.createNewFile()) {

			System.out.println("File is created ");
		}
		
		else {
			
			System.out.println("File is already exist");
		
		}
	}
}
