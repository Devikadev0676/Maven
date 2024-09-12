/*Program to check the addition result is divisible by 10
 Class 1
Return addition result of two numbers
 Class 2
Check the addition result is divisible by 10(use super keyword*/
package superKeyword;

public class Add1 extends Add
{
	int d;
	public void div()
	{
		d=super.addtn(10,20);
		if(d%10==0)
		{
		System.out.println("RESULT IS DIVISIBLE BY 10");
		}
		else
		{
		System.out.println("RESULT IS NOT DIVISIBLE BY 10");
		}
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Add1 ob= new Add1();
		ob.div();

	}

}
