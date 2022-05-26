package Exception;

public class Demo{
	
	public static void main(String[] args) {
		
		
		try {

			int arr[]={1,2,3,45,5};
			
			System.out.println(arr[20]);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" Exception handle 1");

		}

	}
	}