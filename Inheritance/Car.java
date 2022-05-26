package Inheritance;

public class Car {

	String color = "red";

	Car() {

		System.out.println("This is a car constructor");
	}

	void color() {

		System.out.println("The color of car is :" + color);

	}
}

class Bmw extends Car {

	// String color = "white";

	Bmw() {
		super();
		System.out.println("This is Bmw car constructor");
	}

	void color() {

		super.color();
		System.out.println("The color of a car :" + super.color);

	}
}

class Rollsroys extends Bmw {

	// String color = "blue";

	Rollsroys() {
		super();
		System.out.println("This is a rollsroys car constructor");
	}

	void color() {

		super.color();
		System.out.println("The color of a car :" + super.color);

	}
}

class Testcars {

	public static void main(String[] args) {
 
		Rollsroys r = new Rollsroys();

		r.color();
 
	}}
