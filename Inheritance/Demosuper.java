package Inheritance;

class Demosuper {
	
		Demosuper(){
		
		System.out.println("This is Animals Constructor ");
	}
		
		void display() {
		System.out.println("he it is a method");
		}
		}


class Dogsuper extends Demosuper{
	
	  Dogsuper(){
	
	 	super();
	    super.display();
	 	System.out.println("This is Dog Constructor");
	}
}
class TestAnimal{
	
	
	public static void main(String[] args) {
	
		//Dogsuper b=new Dogsuper();    
		

	}

}
