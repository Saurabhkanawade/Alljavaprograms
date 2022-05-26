package Inheritance;

public class Animal4 {
	
	void eat() {
		System.out.println("he is eating");
	}
}

class Dog3 extends Animal4{
	
	void eat() {
		System.out.println("he is eating bread");
	}
	
	void bark() {
		System.out.println("he is barking");
	}
	
	void work() {
		
		super.eat();
		bark();
		eat();
	}
}

class Testanimal5{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog3 d=new Dog3();
	  
		d.work();
	}
}
