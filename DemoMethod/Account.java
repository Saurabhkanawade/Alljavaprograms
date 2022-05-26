package DemoMethod;

 class Account {

     int acc_no;
     String name;
     float amount;
     String bname;
    
     void insert(int ac,String n,float amt,String b) {
    	 
    	 acc_no=ac;
    	 name=n;
    	 amount=amt;
         bname=b;
     }
     void deposit(float amt) {
    	 
    	 amount=amount+amt;
     System.out.println("The amount is deposited :"+amt);
     
     }
     
     void withdraw(float amt) {
    	 
    	 if(amount<amt) {
    		 System.out.println("You have insufficient balance");
    	 }
    	 
    	 else {
    		 amount=amount-amt;
    		 
    		 System.out.println("The amount is Withdraw  :"+amt);
    	      }
     
     }
     
     void checkBalance() {
    	 System.out.println("Your Account Balance is :"+amount);
     }
 
    void displayImfo() {
    	 
    	 System.out.println("Your bank name is : "+bname);
    	 
     }
     
     void displayImfom() {
    	 
    	 System.out.println(acc_no+"  " +name+ " "  +amount);
    	 
     }
}
 class Testaccount{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1=new Account();
		a1.insert(10010203,"Saurabh kanawade",500000, "Union Bank of India");
		
		a1.displayImfo();
		
		a1.displayImfom();
		
		a1.checkBalance();
		
		a1.deposit(10000);
		
		a1.checkBalance();
		
		a1.withdraw(5000);
		
		a1.checkBalance();
		
		a1.withdraw(1000000);
	}

}
