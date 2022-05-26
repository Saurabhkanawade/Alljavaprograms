package Democonstructor;

 class Cons{

	 int a,b,c;
	
	 
    Cons(int i,int j){
			a=i;
			b=j;
		
	 }
	
void display() {
		
	System.out.println(a+b);
	}
  
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons t=new Cons(10,20);
		
		t.display();
	}

}
