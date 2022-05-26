
public class reverse_star_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=i;j++) {
		
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
			
		System.out.print("*");
		}
      System.out.println(" ");		
		
	}

}
}