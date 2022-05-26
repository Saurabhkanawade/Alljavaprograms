package Statickeyword;

 class Priority {
   
	 {
		 System.out.println("Anonymous block");
     }
	
	 Priority(){
		 
		 System.out.println("constructor");
		 	 
	 }
	 
	void one(){
		 
		 System.out.println("method");
	 }
	 
	 
	 static{

		 System.out.println("Static method");
         
	       }
	 
	 public static void main(String args[]) {
		 
	 System.out.println("Main method");
	 
	 Priority s1=new Priority();
	 s1.one();
	 }
}
