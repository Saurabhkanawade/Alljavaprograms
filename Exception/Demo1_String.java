package Exception;

public class Demo1_String {

	public static void main(String[] args) {
		
		try {
			
			String name="Saurabh";
			
			
			System.out.println(name.length());
			
			System.out.println(name);
			
			System.out.println("Exception Not Occurs");
			
		  }
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception is handle by 1");
		}
		
		catch(NullPointerException e) {
			
			System.out.println("Exception is handle by 2");
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Exception is handle by 3");
		}
		
		catch(Exception e) {
			
			System.out.println(" Parent Exception ");
		}
		
		System.out.println();
		System.out.println("this is rest of the code ");
		
	}

}
