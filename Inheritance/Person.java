package Inheritance;

public class Person {
  
	String name;
	int id;
	
	Person(int id,String name){
		
		this.id=id;
		this.name=name;
	}
}
	class Emp extends Person{
		
		float salary;
		
		Emp(int id,String name,float salary){
			
			super(id,name);
			this.salary=salary;
		}
	
	
	void display() {
		
		System.out.println(id +" "+name+" "+salary);
		
	}
	}	
	
	class Testemp{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e=new Emp(101,"saurabh",25000);
		
		e.display();
	}

}
