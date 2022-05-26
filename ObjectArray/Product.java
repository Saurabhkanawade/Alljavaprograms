package ObjectArray;

public class Product {

	int id;
	String name;

	Product(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void display() {

		System.out.println(id + " " + name);
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p[] = new Product[5];

		p[0] = new Product(101, "Asus");
		p[1] = new Product(102, "Apple");
		p[2] = new Product(103, "Lenovo");
		p[3] = new Product(104, "Dell");
		p[4] = new Product(105, "Toshiba");

		System.out.println("The product of an 0 index is :");
		p[0].display();

		System.out.println("The product of an 1 index is :");
		p[1].display();

		System.out.println("The product of an 2 index is :");
		p[2].display();

		System.out.println("The product of an 3 index is :");
		p[3].display();

		System.out.println("The product of an 4 index is :");
		p[4].display();

	}

}
