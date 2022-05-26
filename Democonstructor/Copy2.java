package Democonstructor;

public class Copy2 {
    
	int id;
	String name;
	
	Copy2(int i,String n){
		
		id=i;
		name=n;
	}
	Copy2(){}
	
	void display() {
		
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy2 s1=new Copy2(101,"Saurabh");
		Copy2 s2=new Copy2();
		
		s2.id=s1.id;
		s2.name=s1.name;
		
		s1.display();
		s2.display();
		
		
		
		
		
	}

}
