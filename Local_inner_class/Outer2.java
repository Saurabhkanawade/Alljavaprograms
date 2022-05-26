package Local_inner_class;

class Outer2 {
	

 private int data=39;
 
 void data() {
	 
	 class Inner2{
        		 
		public void print() {
			 System.out.println("the data is :"+data);
		 }
		 }
	 Inner2 i=new Inner2();
	 i.print();
	 
 }
	 public static void main(String[] args) {
		
	 Outer2 o=new Outer2();
	 o.data();
    		 
	}
 }
