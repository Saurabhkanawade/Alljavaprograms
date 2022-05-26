package Local_inner_class;

public class Localouter{

	private int Data=30;
	
	void display() {
		
		class Localinner{
			
			void msg() {
				
				System.out.println("the data of an outer class is :"+Data);
			}
		}
		
		Localinner li=new Localinner();
		li.msg();
	}
	
	public static void main(String[] args) {

		Localouter lo=new Localouter();
		lo.display();
	}

}
