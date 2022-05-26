package Inheritance;

public class Bike {

	void run() {

		System.out.println("Bike is running 1");
	}

}

class Honda extends Bike {

	void run() {

		super.run();
		System.out.println("Bike is running 2");
	}
}

class Testbike {

	public static void main(String[] args) {

		Honda s = new Honda();

		s.run();

	}
}
