package Exception;

public class ArrayIndexOutofbounds {

	public static void main(String[] args) {

		try {

			int a[] = new int[5];
			a[7] = 50;

		}

		catch (ArithmeticException e) {

			System.out.println("Exception hadle 1");
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" Exception handle 2");

		}

		catch (Exception e) {

			System.out.println("Exception hadle 3");
		}

		System.out.println("rest of the code");
	}
}
