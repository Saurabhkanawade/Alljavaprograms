package Statickeyword;

public class Demostatic {

	int id;
	String name;
  static String collage="smbst";
	
	Demostatic(int i,String n){
		
		id=i;
	    name=n;
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+collage);
	}
 class Teststatic{
 
 }
	
	public static void main(String[] args) {	


		// TODO Auto-generated method stub

	 Demostatic s=new Demostatic(101,"Saurabh");
	 Demostatic s1=new Demostatic(102,"Shailesh");
     
	 Demostatic.collage="sharmik collage";
	 
	s.display();
	s1.display();
	}
}
