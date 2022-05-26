package Practice;

import java.io.*;
import java.util.Scanner;

public class Demo_Read {

	public static void main(String[] args) {
		
		System.out.println(" Reading the file ");
		
		try {
			
			File f=new File("Demo.txt");
			
			Scanner s=new Scanner(f);
			
			while(s.hasNextLine()) {
				
				String data=s.nextLine();
				System.out.println(" The data is :"+data);
			}
		}
		
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
