package Interface;

public interface Google {

	void gmail();

	default void youtube() {

		System.out.println("no 1 video platform");
	}
}

class Printdata implements Google {

	public void gmail() {

		System.out.println("this is mail");
	}
}

class Testgoogle {

	public static void main(String[] args) {

		Google g = new Printdata();

		g.gmail();
		g.youtube();
	}

}
