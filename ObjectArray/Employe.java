package ObjectArray;

public class Employe {

	int id;
	String name;
	float salary;
	String location;
	
	public void data(int id,String name,float salary,String location) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.location=location;
	
	}
	
	
	
	void display() {
		
		System.out.println(id +" | "+name+" | "+salary+" | "+location);
	}

	public static void main(String[] args) {
  
		Employe e[]=new Employe[6];
		
		e[0]=new Employe();
		e[1]=new Employe();
		e[2]=new Employe();
		e[3]=new Employe();
		e[4]=new Employe();
		e[5]=new Employe();
		
		
		e[0].data(101, "Shailesh", 65000, "China");
		e[1].data(102, "Saurabh ", 75000, "Qatar");
		e[2].data(103, "Harshal ", 25000, "South Africa");
		e[3].data(104, "Rushi   ", 20000, "Uk");
		e[4].data(105, "Shankar ", 15000, "Dubai");
		e[5].data(106, "Sagar   ", 54000, "America");
	
		
		System.out.println("The data of an employe :");
		System.out.println();
		
		e[0].display();
		e[1].display();
		e[2].display();
		e[3].display();
		e[4].display();
		e[5].display();
	}

}
