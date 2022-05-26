package Democonstructor;

public class Student1 {

	int id;
	String name;
	int age;
	int mob;
	
	Student1(int i,String n){
		
		id=i;
		name=n;
	}
	
	Student1(int i,String n,int a){
		
		id=i;
		name=n;
		age=a;
	}
 Student1(int i,String n,int a,int m){
		
		id=i;
		name=n;
		age=a;
		mob=m;
	}
	
	
	void display() {
		
		System.out.println(id+" "+name+ " "+age+ " " +mob);
	}

public static void main(String args[]) {
	
Student1 s=new Student1(101,"saurabh");	
Student1 s1=new Student1(102,"shankar",25);
Student1 s2=new Student1(102,"shankar",25,982255445);


s.display();
s1.display();
s2.display();  
}
}
