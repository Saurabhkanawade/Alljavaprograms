package Exception_throws;

public class Demo_tryall {

	public static void main(String[] args) {
		
		try {
			System.out.println("Run when Exception is Not Occures 1");

			int a=100/5;
		//	String s=null;
		//	System.out.println(s.length());
			System.out.println("Run when Exception is Not Occures 2");
		}
		//catch(ArithmeticException e) {
		//	System.out.println("Exception is Handled by ArithmeticException");
		//}
		catch(NullPointerException e) {
			System.out.println("Exception is handled by Null");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( "Exception is Handled by Array");
		}
		catch(NumberFormatException e) {
			System.out.println("Exception is Handled by NO format");
		}
		//catch(Exception e) {
	//		System.out.println("This is an parent Exception ");
	//	}

		finally {
			System.out.println("This is finally Block");
		}
		System.out.println("rest of the code");
	}
}
