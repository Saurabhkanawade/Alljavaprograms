package Nested_Inner_Class;

public class Outer {

	private int roll = 35;

	class Inner {

		void msg() {

			System.out.println("the roll no of an student is :" + roll);
		}
	}

	public static void main(String[] args) {

		Outer o = new Outer();
		Outer.Inner i = o.new Inner();

		i.msg();

	}
}
