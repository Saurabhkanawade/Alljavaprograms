package Inheritance;

public class Animal {

	void eat() {

		System.out.println("he is eating");
	}
}

class Dog2 extends Animal {

	void bark() {

		System.out.println("He is barking");
	}
}

class TestDemo {

	public static void main(String[] args) {

		Dog s = new Dog();

		s.bark();
		s.eat();
	}

}
