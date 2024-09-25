package interfaceExample;
import java.util.Scanner;
//import java.math.*;
public class Hdfc implements Rbi
{
	double rate;
    double rdAmount;
    int noOfMonths;
    Scanner sc = new Scanner(System.in);
    public double recurringDeposit()
    {
    	System.out.println("Enter the recurring deposit amount:");
    	rdAmount=sc.nextDouble();
    	return rdAmount;
    }
    public double interestRate(double rdAmount)
    {
        this.rdAmount = rdAmount;
        System.out.println("Enter RD months");
        noOfMonths = sc.nextInt();
        System.out.println("Enter rate of interest:");
        int r= sc.nextInt();
        double totalAmount=Math.pow((rdAmount*(1+r/noOfMonths)),(noOfMonths*1));
        return totalAmount;
        
        }
public static void main(String[] args)
{
	Hdfc ob=new Hdfc();
	ob.recurringDeposit();
	double r=ob.recurringDeposit();
	ob.interestRate(r);
	
}

}
