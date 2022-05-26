//no arg constructor 


package Democonstructor;

 class Constructor1 {
	
	int id;
	String name;
	
	Constructor1(int id,String name){
		
		this.id=id;
		this.name=name;
	}

	void display() {
		
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        Constructor1 c=new Constructor1(102,"Saurabh");		
		Constructor1 c1=new Constructor1(104,"Shailesh");
        
		System.out.println(c instanceof Constructor1);
		System.out.println(c1 instanceof Constructor1);
		
        c.display();
        c1.display();
	}

}

 