package mavenInheritance;

public class Son extends Father
{
public void sonDisplay()
{
	System.out.println("SON METHOD DISPLAYED");
}
public static void main(String args[])
{
	Son ob=new Son();
	ob.grandDisplay();
	ob.fatherDisplay();
	ob.sonDisplay();
	Daughter obj=new Daughter();
	obj.daugDisplay();
}
}
