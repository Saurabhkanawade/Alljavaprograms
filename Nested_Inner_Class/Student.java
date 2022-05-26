package Nested_Inner_Class;

public class Student {

	static String college="Smbst College Sangamner";
	
	static class Info{
		
		static  void data() {
			
			System.out.println("the name of an college is :"+college);
		}
	}
}
	class Teststudent{
		
 
	
	public static void main(String[] args) {
   
   	Student.Info.data();	
		
	}
	}

