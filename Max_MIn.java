
public class Max_MIn {
	public static void main(String[] args) {

		int max =Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		int arr[] = new int[] { 10,12, 43, 63, 242, 6345, 23 };

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" "+arr[i]);
		}
		System.out.println();
		

		for (int print : arr) {

			if (print > max) {

				max = print;
			}
			
		}
			System.out.println("The max value is :"+max);
			
			for (int print : arr) {

				if (print < min) {

					min = print;
				}
				
			}
						
			
			
			System.out.println("The min value is :"+min);
		}

	}

