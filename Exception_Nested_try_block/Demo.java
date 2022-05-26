
package Exception_Nested_try_block;

public class Demo {

	public static void main(String[] args) {


 try {
	 
	
			try {

				System.out.println("going to divide by 0");

				int s = 40 / 0;

			}

			catch (ArithmeticException e) {

				System.out.println(e);
			}

			try {

				int aa[] = new int[5];
				aa[5] = 4;
			}

			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println(e);
			}

			System.out.println("Statment 1");
		}

catch (Exception e) {

			System.out.println("statment 2");
    }

 System.out.println("Rest of the code");

	}
}
