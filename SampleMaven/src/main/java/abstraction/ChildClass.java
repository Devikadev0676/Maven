package abstraction;

public class ChildClass implements SampleInterface
{
public void display()
{
	System.out.println("display abstract  method");
	
}
public void show()
{
	System.out.println("show abstract  method");
	
}
public void showc()
{
	System.out.println("show child class method");
	
}
	public static void main(String[] args) 
	{
		SampleInterface ob=new ChildClass();//Upcasting
		ob.display();
		ob.show();
		ChildClass obj=new ChildClass();
		obj.showc();
	}

}
