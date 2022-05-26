package Encapsulation;

public class College {

	private int roll;
	private String name;
	private String college;

	public int getroll() {

		return roll;
	}
	
	public void setroll(int roll) {
		
		this.roll=roll;
	}
	
	public String getname() {
		
		return name;
	}
	
	public void setname(String name) {
		
		this.name=name;
	}
	
	public String getcollege() {
		
		return college;
	}
	
	public void setcollege(String college) {
		
		this.college=college;
	}

	public static void main(String[] args) {
		
		College c=new College();
		
		c.setroll(101);
		c.setname("Saurabh");
		c.setcollege("Smbst");
		
		System.out.println(c.getroll()+" "+c.getname()+" "+c.getcollege());
	}
}
