package Inheritance;

public class Alphabet {
	
	void rank() {
		System.out.println("worlds no 1 company");
	}
}
 
      class Google extends Alphabet{
      
      void search_engine() {
    	  
    	  System.out.println("worlds no 1 search engine");
      }
      }
      
      class Youtube extends Alphabet{
    	  
    	  void platform() {
    		  
    		  System.out.println("worlds no 1 video platform");
    	  }
    	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google g=new Google();

		Youtube s=new Youtube();
		
		g.search_engine();
		s.rank();
		s.platform();
		
	}

}
