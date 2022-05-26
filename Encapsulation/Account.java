package Encapsulation;

public class Account {

	private long acc_no;
	private long amount;
	private String gmail;
	private String name;

  	public long getAcc_no() {
		return acc_no;
	}
   
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	
	public long getamount() {
		return amount;
	}
	public void setamount(long amount) {
		this.amount=amount;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getgmail() {
		return gmail;
	}
	public void setgmail(String gmail) {
		this.gmail=gmail;
	}
	}

class TestAcount{
	
	public static void main(String args[] ){
	
	Account a=new Account();	

	a.setAcc_no(25142516);
	a.setamount(6000000);
	a.setgmail("saurabhkanawade30@gmail.com");
	a.setname("saurabh");
	
	
	System.out.println(a.getAcc_no()+" | "+a.getname()+" | "+a.getamount()+" | "+a.getgmail());
	}}