package accessmodifier1;

 class SamplePrivate1 
{

	 String name="Devika";
	 void method1() {
		System.out.println("METHOD");
	}
	private static void main(String args[])
	{
		SamplePrivate1 obj1=new SamplePrivate1();
		System.out.println(obj1.name);
		obj1.method1();
		
	}
	}



