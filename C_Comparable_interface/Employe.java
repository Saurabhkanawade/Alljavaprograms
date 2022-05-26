package C_Comparable_interface;

public class Employe implements Comparable<Employe>{

	int id;
	String name;
	String company;
	float salary;
	
	Employe(int id,String name,String company,float salary){
		
		this.id=id;
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	
	public int compareTo(Employe print) {
		
	if(salary==print.salary) {
	
		return 0;
		
	}
	
	else if(salary>print.salary) {
		
		return 1;
	}
	
	else {
		
		return -1;
	}
	}
}
