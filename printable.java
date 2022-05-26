
interface printable {
	void print();
}
interface drowable {
	void drow();

}
class  A2 implements printable,drowable{
	public void print() {
		System.out.println("printable");
	}

	
	public void drow() {
		System.out.println("drowable");
		
		// TODO Auto-generated method stub
		
	}
}
class Test{
	public static void main(String[] args) {
		A2 a=new A2();
		a.print();
		a.
		drow();
		
	}
}