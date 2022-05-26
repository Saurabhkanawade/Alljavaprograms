package Encapsulation;

public class Employes {
	private int id;
	private String name;
	private long salary;
	private String college;
	
	public String getcollege() {
		return college;
	}
	
	public void setcollege(String college) {
		this.college=college;
		
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}
}
class Testemp{

	public static void main(String[] args) {

		
		Employes s=new Employes();
		
		s.setId(101);
		s.setName("saurabh kanawade");
		s.setSalary(680000);
		s.setcollege("Smbst college sangamner");

	System.out.println(s.getId()+" | "+s.getName()+" | "+s.getSalary()+" | "+s.getcollege());
	}

}
