package Local_inner_class;

public class Student {

	private int roll=50;
	
	void display() {
		
        int roll=40;
		String name="saurabh";
		
		
		class Inner{
			
			void print() {
				
				System.out.println("The roll no of an student is :"+roll);
			    System.out.println("The name  of the student  is  :"+name);
			}
		}
		
	Inner i=new Inner();
	i.print();

	}
	
	public static void main(String[] args) {
	
		Student s=new Student();
		s.display();
	}

}
