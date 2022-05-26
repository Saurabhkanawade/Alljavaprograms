package Anonmynous;

interface Age {

	int age=21;
	
	void print();
}	
	class Testage{
	
	public static void main(String[] args) {
	
		Age a=new Age() {
		
      public void print() {
			
			System.out.println("The age of an person :"+age);
		}
	    };
    	a.print();
 	}
	}
