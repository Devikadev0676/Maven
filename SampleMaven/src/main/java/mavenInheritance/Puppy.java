package mavenInheritance;

public class Puppy extends Dog
{
	public void display1()
	{
		System.out.println("CHILD CLASS PUPPY DISPLAYED");
	}

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
	
		Puppy ob=new Puppy();
		ob.display1();
		ob.display();
		ob.type();
		
	}

}
