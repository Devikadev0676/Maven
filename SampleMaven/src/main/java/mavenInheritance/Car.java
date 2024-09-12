package mavenInheritance;

class Car extends SingleInheritance
{
	String model="SEDAN";
	public void display()
	{
		System.out.println("SPORTS CAR");
	}
	 public static void main(String[] args)
	{
		Car c= new Car();
		c.details();
		c.display();
		System.out.println("SPEED :"+c.speed);
		System.out.println("MODEL :"+c.model);
		
		
	}

	}

