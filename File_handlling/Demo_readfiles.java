package File_handlling;

import java.io.*;
import java.util.*;

public class Demo_readfiles {

	public static void main(String[] args) throws Exception{
		
		File f=new File("Demo.txt");
		
		Scanner s=new Scanner(f);

		while(s.hasNext()) {
			
	       String data=s.next();
	       
			System.out.print(" "+data);
		}
	}
}
