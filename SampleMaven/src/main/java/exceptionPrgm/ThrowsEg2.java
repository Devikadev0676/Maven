package exceptionPrgm;

import java.io.IOException;

public class ThrowsEg2
{
	public static void m()throws IOException
	{
		throw new 	IOException();
		
	}

	public static void main(String[] args) 
	{
	 try
	 {
		 m();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }

	}

}
