package ObjectArray;

public class Student {

	int id;
	String name;

	public void setdata(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		
		System.out.println(id+" "+name);
       System.out.println();
	}
}

class Teststudent{
	

public static void main(String args[]) {
	
Student arr[]=new Student[4];

arr[0]=new Student();
arr[1]=new Student();
arr[2]=new Student();// creating an object for the indexes
arr[3]=new Student();


arr[0].setdata(101, "Saurabh ");
arr[1].setdata(102, "Shailesh");
arr[2].setdata(103, "Shankar ");
arr[3].setdata(104, "Sagar");


System.out.println("The student data of an index o is :");
arr[0].display();

System.out.println("The student data of an index o is :");
arr[1].display();

System.out.println("The student data of an index o is :");
arr[2].display();

System.out.println("The student data of an index o is :");
arr[3].display();


/*
System.out.println("The student data of an indexes is :");


arr[0].display();
arr[1].display();
arr[2].display();
arr[3].display();

*/
}
}
