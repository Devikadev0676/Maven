package encapsulation;

public class CustomerDetails
{

	public static void main(String[] args) 
	{
	 Customer ob=new Customer();
	 ob.setName("Devika");
	 System.out.println("Name:"+ob.getName());
	 ob.setAccno(40751);
	 System.out.println("ACCOUNT NUMBER:"+ob.getAccno());
	 ob.setBal(5000);
	 System.out.println("BALANCE:"+ob.getBal());
	 
		
	}

}
