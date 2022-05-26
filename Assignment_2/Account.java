package Assignment_2;

class AccountTest {

	public static void main(String[] args) {

		Account A[] = new Account[5];

		A[0] = new Account();
		A[1] = new Account();
		A[2] = new Account();
		A[3] = new Account();
		A[4] = new Account();

		A[0].insert(101, "Saurabh kanawade", "Pune    ", 1233216, 60000);
		A[1].insert(102, "Shailesh Karpe  ", "Delhi   ", 1233354, 40000);
		A[2].insert(103, "Sagar Bhomale   ", "Banglore", 1235653, 70000);
		A[3].insert(104, "Saurabh Kandekar", "Chennai ", 1235355, 40000);
		A[4].insert(105, "Rushi Kandekar  ", "Mumbai  ", 1235235, 70000);

		A[0].display();
		A[1].display();
		A[2].display();
		A[3].display();
		A[4].display();

	}
}

public class Account {

	int id;
	String user_name;
	String Address;
	float Ac_no;
	float Amount;

	public void insert(int id, String user_name, String Address, float Ac_no, float Amount) {

		this.id = id;
		this.user_name = user_name;
		this.Address = Address;
		this.Ac_no = Ac_no;
		this.Amount = Amount;
	}

	

	public void update() {

	}

	public void search() {

	}

	public void display() {

		System.out.println(id + " | " + user_name + " | " + Ac_no + " | " + Amount + " | " + Address);
	}

}
