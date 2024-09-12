package aggregation;

public class Student
{
String name;
int age,rollno;
Address add; // reference variable created
public Student(String name,int age,int rollno,Address add)
{
	this.name=name;
	this.age=age;
	this.rollno=rollno;
	this.add=add;
}
public void display()
{
	System.out.println("Student name:"+name);
	System.out.println("Student age:"+age);
	System.out.println("Student rollno:"+rollno);
	System.out.println("House number:"+add.hno);
	System.out.println("House name:"+add.hname);
	System.out.println("City:"+add.city);
	System.out.println("Pincode:"+add.pincode);
	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Address obj1=new Address("Nandhanam","Kochin",682026,314);
Student obj=new Student("Devika",32,1,obj1);
obj.display();

	}

}
