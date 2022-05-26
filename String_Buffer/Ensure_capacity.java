package String_Buffer;

public class Ensure_capacity {

	
	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Hello");
		
		s.ensureCapacity(1);
		System.out.println(s);

	}
}
