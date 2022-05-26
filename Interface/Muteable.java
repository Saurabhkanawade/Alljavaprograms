package Interface;

public interface Muteable {

	void mute();
	
}

interface Soundable extends Muteable{
	
	void sound();
	
}

class Data implements Soundable{
	
	public void mute() {
		
		System.out.println("the is mute method");
	}
	
	public void sound() {
		
		System.out.println("this is sound method");
	}
}
	class Testsound{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Data s=new Data();
		
		s.mute();
		s.sound();
	}

}
