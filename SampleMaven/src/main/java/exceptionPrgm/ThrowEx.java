package exceptionPrgm;

public class ThrowEx
{
		public void add(int a,int b)
		{
			int sum=a+b;
		if(sum<10)
		{
			throw new ArithmeticException("SUM NOT LESS THAN 10");
		}
		else
		{
			System.out.println("Sum is less than 10");
		}
	}
	public static void main(String[] args)
	{
		ThrowEx ob=new ThrowEx();
		try
		{
			ob.add(1,8);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}

