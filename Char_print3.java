
public class Char_print3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 64;

		for (int i = 1; i <= 10; i++) {

			for (int j = 10; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print((char) (alphabet + k) + " ");

			}

			System.out.println();
		}
	}
}