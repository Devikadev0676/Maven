package mavenInheritance;

public class ConstructorPrgm 
{
	public ConstructorPrgm()
	{
	
	System.out.println("First constructor");
	}
	public ConstructorPrgm(int a)
	{
		this();
	System.out.println("VALUE OF A:"+a);
	}
	public static void main(String args[])
	{
	ConstructorPrgm ob=new ConstructorPrgm(10);
}
}
