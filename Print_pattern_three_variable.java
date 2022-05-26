
public class Print_pattern_three_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++){
				
			System.out.print("*");
 		}
        	System.out.println(" ");
		}  	
	}
	}

