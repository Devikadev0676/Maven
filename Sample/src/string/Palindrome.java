package string;
public class Palindrome 
{

	public static void main(String[] args)
	{
		String s="Java";
		 System.out.println("Original word:"+s);
		 String reverseStr="";
		 for(int i=s.length()-1; i>=0;--i)
		 {
			
		 reverseStr+= s.charAt(i);
		 }
		 if(s.toLowerCase().equals(reverseStr.toLowerCase()))
		 {
			 System.out.println(s+" is a Palindrome String");
			 
		 }
		 else
		 {
			 System.out.println(s+" is not a Palindrome String");
		 }

	}
}
		

