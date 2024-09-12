package abstraction;

public class Demo extends AbstractClass
{
public void display()
{
	System.out.println("Implementation of Abstract method");
}
public void showc()
{
	System.out.println("BODY OF CHILD CLASS");
	}
	public static void main(String[] args)
	{
Demo obj=new Demo();
obj.display();
obj.show();
obj.showc();

	}

}
