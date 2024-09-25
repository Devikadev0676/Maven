package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFloatEg 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(" FLOAT TYPE");
		ArrayList <Float> l2=new ArrayList<Float>();
		l2.add(12.3f);
		l2.add(56.4f);
		l2.add(78.9f);
		Iterator <Float> it=l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("checking whether element is present");
		System.out.println(l2.contains(5.0f));
		it.remove();
		System.out.println("LIST after removal");
		System.out.println(l2);

	}

}
