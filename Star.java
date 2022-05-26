//import java.util.*;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alphabet=64;
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(i==3 || j==3) {
					
					System.out.print((char)(alphabet+i));
				}
				
				else {
					System.out.print(" ");
				}
				}
		System.out.println();
		}
		}
}



