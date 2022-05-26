package Inheritance;

public class Animal2 {
	
	void eat() {
		System.out.println("he is eating ");
	           }
}

class Dog extends Animal{

	
	void bark() {
		System.out.println("he is barking");
  }
  }

class Babydog extends Dog{
	
	void sweep() {
		
		System.out.println("he is sweeping");
	}
}

class Test{
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
  
			Babydog s=new Babydog();
			
			s.sweep();
			s.bark();
			s.eat();
	}

}
