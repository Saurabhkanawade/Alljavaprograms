package This;

public class Demothis {

	void m() {
		
		System.out.println("this is m method");
	} 
	
	void n() {
		
		System.out.println("this is n method");
		
	this.m();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demothis s=new Demothis();
		
		s.n();
		
	}

}
