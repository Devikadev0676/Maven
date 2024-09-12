package finalKeyword;

public final class FinalVar 
{
    final int a=10;
    final int b; //blank final variable or un-initialized final variable
	public FinalVar()
	{
		b=20;
		//a=40; here error occurs since final cannot be changed
	}
	public final void detail() 
	{
		System.out.println("final keyword method");
	}
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
