package exceptionPrgm;

public class SamplePrgm 
{

	public static void main(String[] args)
	{
		int a=10,b=20;
		int sum=a+b;
		try
		{
			int res=sum/0;
			System.out.println("TRY BLOCK");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
