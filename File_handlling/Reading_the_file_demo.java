package File_handlling;

import java.io.*;
import java.util.*;

public class Reading_the_file_demo {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("C:\\Users\\saura\\Desktop\\My Files\\java.txt");
		
		Scanner s=new Scanner(f);
		
		while(s.hasNext()) {
			
			String data=s.next();
			System.out.print(" "+data);
		}
		
	}
}
