package polymorphism;

public class Onseason
{
	int total=0;
	float onseasondis;
public void  discount(int price ,int price1)
{
	int total =price+price1;
	onseasondis=total*0.4f;
	System.out.println("ONSEASON DISCOUNT:"+onseasondis);	
}
}
