package File_handlling;

import java.io.*;

public class Demo_writeFile {

	
	public static void main(String[] args) {
		
		try {
			
		
		FileWriter f=new FileWriter("C:\\Users\\saura\\eclipse-workspace\\Saurabh\\java.txt");
			
		f.write("Hello guys my name is saurah kanawade .");
		
		System.out.println("This is wroted successfully ");
			f.close();
		}
		
		 catch (IOException e) {

			 e.printStackTrace();
		}
	}
}
