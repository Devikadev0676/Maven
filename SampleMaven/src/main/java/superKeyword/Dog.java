package superKeyword;

public class Dog extends Animal
{
	String color="Brown";
	String b;
	public Dog(String breed)
	{
        super("SHITZU");
		System.out.println("child class CONSTRUCTOR");
		System.out.println("BREED:"+breed);
	}
	public void display()
	{
		super.display();
		System.out.println("child class method");
		System.out.println("Color:"+color);
		System.out.println(super.color);
		
		
	}
	
	public static void main(String[] args)
	{
		Dog ob=new Dog("DOBER");
		System.out.println(ob.color);
		ob.display();
		
	}

}
