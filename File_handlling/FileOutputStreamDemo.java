package File_handlling;

import java.io.*;

public abstract class FileOutputStreamDemo extends OutputStream{

	public static void main(String[] args) {

		try {

			FileOutputStream f = new FileOutputStream("saurabh.txt");
			String s = " this is my file  ";
			String s1=" This another String into existing file ";

			byte b[] = s.getBytes();
			byte b1[]=s1.getBytes();

			f.write(b);
			f.write(b1);
			f.write(65);
			f.close();

			System.out.println(" wrote into the file successfully");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
