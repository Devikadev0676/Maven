package mavenInheritance;

public class InstanceName 
{
String name;
public String get(String n)
{
	return n;
}
public static void main(String args[])
{
	InstanceName ob=new InstanceName();
	System.out.println(ob.get("DEVIKA"));
}
}
