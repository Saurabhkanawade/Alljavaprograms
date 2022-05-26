package Statickeyword;

/**
 * @author luser
 *
 */
public class Employe {
	int id;
	String name;
	float salary;
	static String company_name=" TCS ";
	
	Employe(int i,String n,float s){
		
		id=i;
		name=n;
		salary=s;
	}
	
	void display() {
		
		System.out.println(id+" | "+name+" | "+salary+" | "+company_name);
	}
	
	class Testemploye{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employe e1=new Employe(101,"saurabh kanawade",30000);
		Employe e2=new Employe(102,"Shankar kandekar",25000);
		
		e1.display();
		e2.display();
		
	}

}
