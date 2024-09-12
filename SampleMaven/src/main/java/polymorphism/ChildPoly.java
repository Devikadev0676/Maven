package polymorphism;

public class ChildPoly  extends ParentPoly
{
	public void display(String n,int a)
	{ 
		super.display("Kochi",21);// instead of creating object
		System.out.println("Name="+n);
		System.out.println("Age="+a);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChildPoly obj= new ChildPoly();
		obj.display("Devika",32);
		
		
	}

}
