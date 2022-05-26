package Local_inner_class;

public class Student2 {

	//private int roll=50;
	
	void display() {
		
        int roll=60;
		String name="saurabh";
		
		
		class Inner{
			
			int roll=40;
			String name="shankar";
			
			void print() {
				
				System.out.println("The roll no of an student is :"+roll);
			    System.out.println("The name  of the student  is  :"+name);
			}
		}
		
	Inner i=new Inner();
	i.print();

	}
	
	public static void main(String[] args) {
	
		Student2 s=new Student2();
		s.display();
	}

}
