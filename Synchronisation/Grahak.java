package Synchronisation;

public class Grahak {

	int Amount = 5000;

	synchronized void withdraw(int Amount) {

		System.out.println(" Going to withdraw the amount ");

		if (this.Amount < Amount) {

			System.out.println(" Less Amount , going to deposit the amount ");

			try {

				wait();

			} catch (Exception e) {
				e.printStackTrace();
			}

			this.Amount -= Amount;

			System.out.println(" amount is withdraw ");
		}
	}

	synchronized void deposit(int Amount) {

		System.out.println(" Going to deposit the Amount");

		this.Amount = Amount;

		System.out.println(" Amount is sucessfully deposited ");

	}
}

class Tstthesyncho {

	public static void main(String[] args) {

		final Grahak G = new Grahak();

		new Thread() {

			public void run() {

				G.withdraw(6000);

			}
		}.start();

		new Thread() {
			
			public void run() {
				
				G.deposit(1000);
			}
		}.start();
	}

}
