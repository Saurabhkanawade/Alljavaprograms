package Exception_throws;

import java.io.IOException;

public class Demo2 {

	void msg()throws IOException {

		throw new IOException("Device error");
	}

	public static void main(String[] args) {
		
		try {
			
			Demo2 d=new Demo2();
			d.msg();
		}
		
		catch(Exception e) {
			
			System.out.println("The Exception is handle");
		}
		
		System.out.println("The rest of the code id here");
	}
}
