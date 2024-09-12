package string;

public class StringReverse
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 String s="Hello";
 System.out.println("Original word:"+s);
 System.out.println("Reversed word:");
 
 for(int i=s.length()-1; i>=0;i--)
 {
	 System.out.print(s.charAt(i));
 }
	}

}
