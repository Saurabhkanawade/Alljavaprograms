
package Practice;

import java.io.*;

public class Demo_exist {
	public static void main(String[] args) {
		
	

	File f=new File("Demo.txt");
	
	if(f.exists()) {
		
		System.out.println(" The name of the file is :"+f.getName());
		System.out.println(" The length of the file is : "+f.length());
		System.out.println(" The file is readable or not :"+f.canRead());
		System.out.println(" The file is writeable or not : "+f.canWrite());
		
	}
	else {
		
		System.out.println(" File is not founds ");
	}
	}
}
