package File_handlling;

import java.io.*;

public class Demo_exist {

	public static void main(String[] args) {
		
		File f=new File("saurabh.txt");
		
		if(f.exists()) {
			
			System.out.println(" The name of the file   :"+f.getName());
			System.out.println(" The length of the file :"+f.length());
			System.out.println(" The file is readable or not :"+f.canRead());
			System.out.println(" The file is writable or not :"+f.canWrite());
		}
		else {
			
			System.out.println(" File not Founds ");
		}
	}
}
