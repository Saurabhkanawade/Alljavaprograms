package File_handlling;

import java.io.*;

public class Write_into_file_demo {
	
	public static void main(String[] args) throws Exception{

		FileWriter f=new FileWriter("C:\\Users\\saura\\Desktop\\My Files\\java.txt");

		f.write("Hey guys my name is saurabh kanawade at post vadgaon landga tel sangamner dist ahamadnagar state maharashtra");
		
		f.flush();
		f.close();
		
		System.out.println("Succesfully wrote into the file");
	}

}
