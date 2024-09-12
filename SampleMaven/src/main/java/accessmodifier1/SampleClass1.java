package accessmodifier1;

public class SampleClass1 
{
protected String name="Devika";
protected void method1() {
	System.out.println("METHOD");
}
public static void main(String args[])
{
	SampleClass1 obj1=new SampleClass1();
	System.out.println(obj1.name);
	obj1.method1();
	
}
}
