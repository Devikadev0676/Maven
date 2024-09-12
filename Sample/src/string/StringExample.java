package string;

public class StringExample {

	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="World";
		String s4="hello";
		String s3=new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.concat(s3));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.startsWith("H"));
		System.out.println(s4.endsWith("lo"));
		
	    String s5="   hi ";
		System.out.println(s5.trim());
		String s6="Java is simple";
		System.out.println(s6.replace("Java","Phython"));
		
		int a=10;
		String s7=String.valueOf(a);
		System.out.println(s7+10);
		
		System.out.println(s6.contains("simple"));
		
		
		
	}

}
