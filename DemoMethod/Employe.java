package DemoMethod;

public class Employe {
 
	int id;
	String name;
    float salary;

    void insert(int i,String n,float s) {
    	
    	id=i;
    	name=n;
    	salary=s;
    	
    }
    void printData(){
    
    	System.out.println(id+" "+name+" "+salary);
    	
    }
    }
	class Testemploye{
		
	
	public static void main(String[] args) {
	
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		
		e1.insert(101, "Saurabh ", 25000);
		e2.insert(102, "Sagar   ", 29000);
		e3.insert(103, "Shailesh", 18000);
		
		e1.printData();
		e2.printData();
		
		//e2.displayImformation();
    	//e3.displayImformation();
	}

}
