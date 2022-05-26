package Statickeyword;

public class Statmethod {
     
	int id;
	String name;
	static String collage="ACOVE";
	
	Statmethod(int i,String n){
		id=i;
		name=n;
	}
	
  static void chang() {
   
	//  name="Shailesh";
	  collage="smbst";
	
}
  
  void display() {
	  
	  System.out.println(id+" "+name+" "+collage);
  }
  
  class Testmethod{
	  
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		Statmethod.chang();  //calling change method
        
		
		Statmethod s=new Statmethod(101,"Saurabh");
	    Statmethod s1=new Statmethod(102,"Shankar");
    
	    s.display();
	    s1.display();
        	
	}
}
