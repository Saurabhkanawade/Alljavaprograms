package Inheritance;

public class Jio {

	void data() {

		System.out.println("Jio is big telecom network");
	}
}

class Reliance extends Jio {

	void data2() {

		System.out.println("This is parent company");
	}
}

class Petrol extends Jio {

	void datas() {
		System.out.println("This is jio");
	}



	public static void main(String args[]) {

		
		Petrol p=new Petrol ();
		Reliance a=new Reliance();
		p.datas();
		p.data();
		a.data2();
	}
}