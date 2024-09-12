package interfaceExample;

public class ChildInterface implements InterfaceParent1,InterfaceParent2
{
public void show()
{
	System.out.println("PARENT INTERFACE 1 METHOD");
	System.out.println(PAR1_VAR);
	}
public void display()
{
	System.out.println("PARENT INTERFACE 2 METHOD");
	System.out.println(PAR2_VAR);
	}
	public static void main(String[] args)
	{
		ChildInterface ob=new ChildInterface();
		ob.display();
		ob.show();
		// TODO Auto-generated method stub

	}

}
