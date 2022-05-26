package Inheritance;

public class Animal3 {
	
	String color="white";
	
}

class Dogs extends Animal3{
	
	String color="black";
	
	void printcolor() {
		
		System.out.println(" "+color);
		System.out.println(" "+super.color);
		
	}
}
class Testanimals1{
	
	public static void main(String args[]){
		
		Dogs s=new Dogs();
		
		s.printcolor();
	}

}