	

public class Reverse_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=4;j>=i;j--) {
				
					System.out.print(" ");
		}
				for(int k=1;k<=i;k++) {
				
			System.out.print(" *");
		}
        System.out.println(" ");
	
	}

	}
}
