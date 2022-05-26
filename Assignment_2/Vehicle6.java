package Assignment_2;

public class Vehicle6 {
	
	int veh_no;
	String Color;
	String Model;
	int Speed;
	String Company;
	
	Vehicle6(int veh_no,String Color,String Model,int Speed,String Company){
		
		this.veh_no=veh_no;
		this.Color=Color;
		this.Model=Model;
		this.Speed=Speed;
		this.Company=Company;
		
	}
	
	void display() {
		
		System.out.println(veh_no+" | "+Color+" | "+Model+" | "+Speed+" | "+Company);
		
	}

	public static void main(String[] args) {
		
		Vehicle6 V1=new Vehicle6(132,"Red   ","X3",200,"Mercedis");
		Vehicle6 V2=new Vehicle6(645,"Yellow","l5",300,"Lamborgini");
		Vehicle6 V3=new Vehicle6(464,"Blue  ","X3",200,"BMW");
		
		System.out.println(V1 instanceof Vehicle6);
		
		V1.display();
		V2.display();
		V3.display();
	}
}
