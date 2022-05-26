package Inheritance;

public class Employe2 {

	// int salary=25000;

	Employe2() {

		System.out.println("This is employes constructor");

	}

	static int salary(int a) {

		return a;
	}
}

class Manager extends Employe2 {

	Manager() {

		super();
		System.out.println("This is managers constructors");
	}

	void salary() {

		System.out.println("Manager have to manage the company");
	}
}

class Teamleader extends Manager {

	public Teamleader() {

		super();
		super.salary();
		System.out.println("this is a teamleader");

	}

	void work() {
		System.out.println("team leader supervise the team");
	}
}

class Testmanager {

	public static void main(String args[]) {

		System.out.println("The salary of an employe :" + Employe2.salary(25000));
		System.out.println();

		Teamleader m = new Teamleader();

		m.work();

	}
}
