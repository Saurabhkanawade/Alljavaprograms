package File_handlling;

import java.io.*;
import java.util.*;

public class Demo_Readfile {

	public static void main(String[] args) {
		
		try {
			
		
		File f=new File("saurabh.txt");

		System.out.println(" Reading the file ");

		Scanner s=new Scanner(f);
		
		while(s.hasNext()) {
			
			String data=s.nextLine();
			
			System.out.print(data);
		}
		
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
}
}