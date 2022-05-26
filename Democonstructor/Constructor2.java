//parameterised constructor

package Democonstructor;

public class Constructor2 {
	
	int id;
	String name;
	
	Constructor2(int i,String n){
		
		id=i;
		name=n;
		
	}
  void display() {
	  
	  System.out.println(id+" "+name);
	  }

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor2 c1=new Constructor2(101,"Saurabh");
		Constructor2 c2=new Constructor2(101,"Shailesh");
		
		c1.display();
		c2.display();

}

}
