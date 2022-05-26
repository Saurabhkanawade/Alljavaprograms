import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		int count = 1;

		int n;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {

				count++;
			}
		}
			if (count == 2) {

				System.out.println("The is prime ");
			}

			else {

				System.out.println("NO is not prime");
			}
		}

	}

