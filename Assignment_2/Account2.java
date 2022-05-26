package Assignment_2;

import java.util.Scanner;

public class Account2 {

	public int id;
	public float Ac_no;
	public float Amount;
	public String user_name;
	public String Address;

	Account2(int id, String user_name, float Ac_no, float Amount, String Address) {

		this.id = id;
		this.user_name = user_name;
		this.Address = Address;
		this.Ac_no = Ac_no;
		this.Amount = Amount;
	}

	public int getid() {
		return id;
	}

	public void setid(float id) {

		id = id;
	}

	public float getAc_no() {
		return Ac_no;
	}

	public void setac_no(float Ac_no) {
		Ac_no = Ac_no;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float Amount) {
		Amount = Amount;
	}

	public String getuser_name() {
		return user_name;
	}

	public void setuser_name(String user_name) {
		user_name = user_name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {

		Address = Address;
	}

	public void display() {

		System.out.println(id + " | " + user_name + " | " + Ac_no + " | " + Amount + " | " + Address);
	}

	public static void main(String[] args) {

		int id;
		float Ac_no;
		float Amount;
		String user_name;
		String Address;
		int opration;
		int Account;
		int count=0;
		Scanner s = new Scanner(System.in);

		Account2 A[] = new Account2[10];

		while (true) {

			System.out.println(" 1 : ADD New Account         ");
			System.out.println(" 2 : UPDATE Existing Account ");
			System.out.println(" 3 : DELETE Existing Account ");
			System.out.println(" 4 : SEARCH The Account      ");
			System.out.println(" 5 : Display All Account     ");
			System.out.println(" 6 : EXIT                    ");
			System.out.println();
			System.out.println("Enter the Opration_no that you have to perform  ( 1 to 6 )");

			opration = s.nextInt();

			switch (opration) {

			case 1:
				System.out.println(" ADD ACCOUNT ");
				System.out.println("Enter How Many Account you have to ADD ");
				int n = s.nextInt();

				for (int i = 0; i < n; i++) {

					System.out.println(" Enter the Account id  ");
					id = s.nextInt();

					System.out.println(" Enter the User_name   ");
					user_name = s.next();

					System.out.println(" Enter the Acc_no      ");
					Ac_no = s.nextFloat();

					System.out.println(" Enter the Amount      ");
					Amount = s.nextFloat();

					System.out.println(" Enter the User Address");
					Address = s.next();

					System.out.println(" Enter The Second Account ");
					System.out.println();

					A[count] = new Account2(id, user_name, Ac_no, Amount, Address);

					count++;

				}

				System.out.println(" Your Account Has been Added Sucessfully ");
				System.out.println();
				break;

			case 2:

				System.out.println(" UPDATE THE ACCOUNT ");
				System.out.println(" Enter the id of Account to update ");
				id = s.nextInt();

				for (int i = 0; i < count; i++)

				{

					if (A[i] != null && A[i].getid() == id) {

						System.out.println(" Enter the user name to update ");
						user_name = s.next();
						A[i].setuser_name(user_name);

						System.out.println(" Enter the Ac_no to update ");
						Ac_no = s.nextFloat();
						A[i].setac_no(Ac_no);

						System.out.println(" Enter the amount to update ");
						Amount = s.nextFloat();
						A[i].setAmount(Amount);

						System.out.println("Enter the Address to update ");
						Address = s.next();
						A[i].setAddress(Address);

						System.out.println();
					}

				}

				System.out.println(" The Account is Updated sucessfully");
				break;

			case 3:
				System.out.println(" ");

			{

			}

			case 4:
				System.out.println(" ");

			{

			}

			case 5:
				System.out.println(" DISPLAY THE ALL ACCOUNT ");
				System.out.println(" All Accounts are HERE : ");

				for (int i = 0; i < count; i++) {
					
					System.out.println(A[i]);
				}

				System.out.println(" THIS IS ALL ACCOUNTS ");
				break;

			case 6:
				System.out.println(" EXIT The Program ");

				System.exit(0);

				break;

			default:

				System.out.println(" Enter the Right Opration ");

			}

		}

	}
}
