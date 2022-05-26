package File_handlling;

import java.io.*;

public class Demo_filewrite {

	public static void main(String[] args) throws Exception{
		
		FileWriter f=new FileWriter("Demo.txt");
		
		f.write("Hello guys my name is saurabh kanawade at post vadgaon landga tel sangamner dist ahamandnagar state maharashtra country india");
		
		f.flush();
		f.close();
		
		System.out.println(" Succesfully wrote into the file Alright !");
	}
}
