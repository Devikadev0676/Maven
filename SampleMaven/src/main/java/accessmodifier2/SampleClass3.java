package accessmodifier2;

import accessmodifier1.SampleClass1;

public class SampleClass3 extends SampleClass1
{

	public static void main(String[] args)
	{
		SampleClass3 obj1=new SampleClass3();
		System.out.println(obj1.name);
		obj1.method1();
		
	}

}
