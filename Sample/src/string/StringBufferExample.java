package string;

public class StringBufferExample
{
public static void main(String args[])
{
	StringBuffer s1= new StringBuffer("hello");
	s1.append("Java");
	System.out.println(s1);
	s1.replace(1,3,"java");
	System.out.println(s1);
	s1.insert(1,"Hai");
	System.out.println(s1);
	s1.delete(1,3);
	System.out.println(s1);
	s1.reverse();
	System.out.println(s1);
	System.out.println(s1.capacity());
	
}
	
}
