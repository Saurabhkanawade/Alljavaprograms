package Exception_throws;

import java.io.IOException;

public class Demo {

	void m() throws IOException {

		//throw new IOException("Device Error");
	}

	void n() throws IOException {

		m();
	}

	void p() {

		try {
			n();
		}

		catch (Exception e) {

			System.out.println("Exception is handled");
		}
	}

	public static void main(String[] args) {

		Demo s = new Demo();

		s.p();

		System.out.println("this is rest of the code");
	}
}