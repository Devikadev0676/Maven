package encapsulation;

public class Bank
{
private int pin;
public void setPin(int pin)
{
	this.pin=pin;
}
public void getPin()
{
	System.out.println("Entered pin is:"+pin);
}
public void validpin() 
{
	if(pin==1001||pin==1234||pin==1212)
	{
		System.out.println("VALID PIN");
	
	}
	else
		
	{
		System.out.println("INVALID PIN");
		
	}
	
}
}
