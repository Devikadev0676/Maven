package exceptionPrgm;

public class MultiCatch 
{
	public static void main(String[] args) 
	{ 
	
		int a=10,b=20;
		int sum=a+b;
		try
		{
			int arr[]=new int[10];
			arr[12]=20;
			int res=sum/0;
			System.out.println("TRY BLOCK");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound");	
			}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}
	}
	}

