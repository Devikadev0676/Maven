package collection;
import java.util.ArrayList;
import java.util.List;


public class CollectionExample
{

	public static void main(String[] args)
	{
		List<String> list2=new ArrayList();
		list2.add("DEvika");
		list2.add("12");
		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.isEmpty());
		
		System.out.println("NON GENERIC COLLECTION");
		ArrayList l1=new ArrayList();
		l1.add("Aadhiv");
		l1.add(56);
		l1.add("Nandhanam");
		System.out.println(l1);
		
		System.out.println(" GENERIC COLLECTION");
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
		
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
		

	System.out.println("foreach loop");
	for(String i:l2)
	{
		System.out.println(i);
	}
	
	
}
}
