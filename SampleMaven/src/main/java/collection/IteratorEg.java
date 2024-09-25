package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorEg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList <String> l2=new ArrayList<String>();
		l2.add("Aadhiv");
		l2.add("Aadhiv");
		l2.add("56");
		l2.add("Nandhanam");
		l2.add(null);
		l2.add(null);
		l2.remove("Aadhiv");
		l2.remove(2);
		l2.add(2, "Rajan");
		System.out.println(l2);
		System.out.println("LIST USING ITERATOR");
		Iterator <String> it=l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("checking whether element is present");
		System.out.println(l2.contains("Aadhiv"));
		it.remove();
		System.out.println("LIST after removal");
		System.out.println(l2);
		
		
		
		

	}

}
