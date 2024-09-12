package encapsulation;

public class Student
{
private int rollno; // all the variables must be private
private String name;
private String dept;
public void setter(int rollno,String name,String dept)
{
	this.rollno=rollno;
	this.name=name;
	this.dept=dept;
}
public void getter()
{
	System.out.println("ROLLNO:"+rollno);
	System.out.println("NAME:"+name);
	System.out.println("DEPARTMENT:"+dept);
}
}
