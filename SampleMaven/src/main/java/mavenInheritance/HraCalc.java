package mavenInheritance;

public class HraCalc extends EmployeeAssignmt
{
public void hra()
{
	double hracalc=0.05*bp;
	double pfcalc=0.20*bp;
	System.out.println("HRA:"+hracalc);
	System.out.println("PF:"+pfcalc);
	double totsal=(bp+hracalc+bonus)-(pfcalc-ded);
	System.out.println("TOTAL SALARY:"+totsal);
}

}
