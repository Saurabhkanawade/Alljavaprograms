package Collection_Framework;
import java.util.*;
public class Employe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eploye1 e1=new Eploye1(101,"Sagar","Maruti",12000);
Eploye1 e2=new Eploye1(102,"Shankar","xuv",15000);
Eploye1 e3=new Eploye1(103,"Rushi","bmw",13000);
Eploye1 e4=new Eploye1(104,"Saurbh","Audi",14000);

ArrayList<Eploye1> a=new ArrayList<Eploye1>();

a.add(e1);
a.add(e2);
a.add(e3);
a.add(e4);

Iterator i=a.iterator();

while(i.hasNext()) { 
	

Eploye1 emp=(Eploye1)i.next();

System.out.println(emp.id+","+emp.name+","+emp.company+","+emp.salary);

	}
	}
}