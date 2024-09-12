package mavenInheritance;
import java.util.Scanner;
public class EmployeeAssignmt 
{
	int bp,ded,bonus;
	public void getDetails()
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay:");
	    bp= sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the deduction amount:");
		 ded= sc.nextInt();
		 Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the bonus amount:");
	bonus= sc2.nextInt();
	}
	public void print() {
		
	    System.out.println("*************SALARY SLIP**********");
		System.out.println("BASIC PAY:"+bp); 
		System.out.println("DEDUCTION:"+ded);
		System.out.println("BONUS:"+bonus);
		
	}
	
}
