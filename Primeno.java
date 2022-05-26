import java.util.*;

public class Primeno {

	public static void main(String[] args) {

		int n;
		int count = 1;

		System.out.println("Enter the no to check");

		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		int i;

		for (i = 1; i < n; i++) {

			if (n % i == 0) {

				count++;

			}
		}
		if (count == 2) {

			System.out.println("The a prime no");
		}

		else {

			System.out.println("The no is not prime");
		}

	}
}
