package encapsulation;

public class User 
{

	public static void main(String[] args)
	{
		Bank ob=new Bank();
		ob.setPin(1234);
		ob.getPin();
		ob.validpin();

	}

}
