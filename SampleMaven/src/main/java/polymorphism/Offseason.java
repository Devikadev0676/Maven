package polymorphism;
import java.util.Scanner;

public class Offseason extends Onseason
{
	int total=0;
	float offseasondis;
public void  discount(int price ,int price1)
{
	int total =price+price1;
	offseasondis=total*0.15f;
	System.out.println("OFFSEASON DISCOUNT:"+offseasondis);	
}
	public static void main(String[] args) 
	
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the season whether Onseason / Offseason:");
	String season=sc.next();
	System.out.println("Enter the price of first item:");
	int price=sc.nextInt();
	System.out.println("Enter the price of second item:");
	int price1=sc.nextInt();
	Offseason ob= new Offseason();
	Onseason obj=new Onseason();
	if(season.equals("Offseason"))
	{
		ob.discount(price, price1);
		
	}
	else
	{
		obj.discount(price, price1);
	}
	}

}
