package Statickeyword;

public class Thisdemo {
  
	int id ;
	String name;
	String collage;
	
	Thisdemo(int id,String name,String collage){
/*		
		id=id;
		name=name;
		collage=collage;
	*/
		this.id=id;
		this.name=name;
		this.collage=collage;
		
	
		
	}
	
	void display() {
		
		System.out.println(id+" | "+name+" | "+collage);
	}
	
	class Testthis{
		
	}
	
	public static void main(String args[]) {
		
		Thisdemo s=new Thisdemo( 101,"Saurabh kanawade","Smbst ");
		Thisdemo s1=new Thisdemo(102,"Shailesh karpe  ","sharmik");
		
		s.display();
		s1.display();
	}
}

