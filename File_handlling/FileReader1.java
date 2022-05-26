package File_handlling;

import java.io.*;
import java.util.*;

public class FileReader1 {

	public static void main(String[] args) throws IOException{
		
		FileReader f=new FileReader("saurabh.txt");
		
		Scanner s=new Scanner(f);
		
		while(s.hasNextLine()){

			String data=s.nextLine();

			System.out.println(" The data is : "+data);
		}
		
	}
}
