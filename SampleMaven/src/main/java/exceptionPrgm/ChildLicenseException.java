package exceptionPrgm;

public class ChildLicenseException
{
public static void check(int age)throws LicenseException
{
	if(age<18) 
	{
		System.out.println("Eligible");
    }
	else
	{
		throw new LicenseException("Not Eligible");
	}
	
}
public static void main(String args[])
{
	try
	{
		ChildLicenseException.check(15);
	}
	catch(LicenseException e)
	{
		System.out.println(e);
	}
}
}
