package Polymorphism;

public class Parent {

	String name;

	void data() {
		System.out.println("this is parent class method");
	}
}

class Child extends Parent {

	int age;

	void data() {

		//super.data();
		System.out.println("this is a child class method");
	}
}

class Test {
	public static void main(String args[]) {

		Parent p = new Child();

		p.name = "saurabh";

		System.out.println("name of parent   : " + p.name);

	
		System.out.println("The child class");
		
		Child c = (Child) p;

		c.age = 18;

		System.out.println("the age of an child  :" + c.age);
		System.out.println("the name of an child :" + c.name);

		c.data();
		
		p.data();

	}
}
