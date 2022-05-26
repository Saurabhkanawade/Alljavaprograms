package File_handlling;

import java.io.*;
import java.util.*;

public class Demo_FileInputStream {

	public static void main(String[] args)throws Exception {
		
		FileInputStream f=new FileInputStream("Demo.txt");
		
		try (Scanner s = new Scanner(f)) {
			while(s.hasNext()) {
				
				String data=s.next();
				System.out.print(" "+data);
			}
		}
	}
}
