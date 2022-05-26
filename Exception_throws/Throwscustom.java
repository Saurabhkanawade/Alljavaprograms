package Exception_throws;

public class Throwscustom extends Exception{

	Throwscustom(String s){
		
		super(s);
	}
}
	
 class Demo_displays {
		
		static void validate(int a) throws Throwscustom{
			
			if(a < 17) {
				
				throw new Throwscustom("age is not valid");
			}
			
			else {
				
				System.out.println("Your age is valid");
			}
		}	
	
public static void main(String[] args) {
	
	try {
          Demo_displays.validate(12);
	}
	catch(Throwscustom e) {
		System.out.println("Exception is handled :  "+e);
	}
	
}
}