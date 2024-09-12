package abstraction;

public class Video extends Google
{
	public void search()
	{
		System.out.println("SEARCH IS VIDEO");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Video ob=new Video();
		ob.search();
		Image obj=new Image();
		obj.search();

	}

}
