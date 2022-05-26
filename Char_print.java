
public class Char_print {

	public static void main(String[] args) {
		
		int character=71;
		
		for(int i=0;i<6;i++) {
			
			for(int j=6;j>i;j--) {
				
				System.out.print(" "+(char)(character+i));
			}
			System.out.println();
		}
	}
}
