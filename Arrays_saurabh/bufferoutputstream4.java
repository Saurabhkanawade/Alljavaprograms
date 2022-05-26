package Arrays_saurabh;
import java.io.*;

public class bufferoutputstream4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream sk=new FileOutputStream("sk.txt");
		BufferedOutputStream sk1=new BufferedOutputStream(sk);
		
		String s="welcome";
		byte b[]=s.getBytes();
		
		sk1.write(b);
		
		sk1.flush();
		sk1.close();
		System.out.println("write successfully");
	}

}
