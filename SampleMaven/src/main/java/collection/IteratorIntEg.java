package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIntEg 
{

	public static void main(String[] args) 
	{
		System.out.println("INTEGER TYPE");
		ArrayList <Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(56);
		l2.add(789);
		Iterator <Integer> it=l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		it.remove();
		System.out.println("LIST after removal");
		System.out.println(l2);

	}

}
