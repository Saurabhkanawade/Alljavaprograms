package Interface;

public interface Printable {

	 void print();
	
}
interface Showable{
	
	 void show();
}

class Display  implements Printable , Showable{
	
	public void print() {
		
		System.out.println("this is a print method");
	}
	
	public void show() {
		
		System.out.println("this is a show method");
	}
}

class Testones{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

   Display d=new Display();
   
   d.print();
   d.show();
	
	}
	}
