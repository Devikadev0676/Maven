package mavenInheritance;

public class Developer extends Employee
{
	 String desgn="DEVELOPER";
	public void display1()
	{
		System.out.println("DEVELOPER CLASS DISPLAYED");
	}
public static void main(String args[])
{
	Developer ob=new Developer();
	System.out.println("CLASS NAME:"+ob.name);
	ob.display();
	System.out.println("DESIGNATION:"+ob.desgn);
	ob.display1();
	Tester obj=new Tester();
	obj.testerDisplay();
	
}

}
