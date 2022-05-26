package Assignment_2;


public class Vehicle {

	int veh_no;
	String Veh_name;
	String company;

	Vehicle(int no, String name) {

		veh_no = no;
		Veh_name = name;
	}

	Vehicle(int no, String name, String com_name) {

		veh_no = no;
		Veh_name = name;
		company = com_name;
	}

	void display() {

		System.out.println(veh_no + " | " + Veh_name + " | " + company);
	}
}

class Test {

	public static void main(String[] args) {

		Vehicle V1 = new Vehicle(1311, "Thar");
		Vehicle V2 = new Vehicle(4522, "Xuv", "Mahindra");

		V1.display();
		V2.display();

	}

}