package program;
import java.util.Scanner;

public class GrossSalary {
	int salary;
	float grossSalary;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Salary");
		salary=scan.nextInt();
	}
	void findGrossSalary()
	{
		if(salary<=10000)
		{
			grossSalary=(float) (salary+(salary*0.2)+(salary*0.8));
			System.out.println("GrossSalary is" +grossSalary);
			
		}
		if(salary>=10000 && salary<=20000)
		{
			grossSalary=(float) (salary+(salary*0.25)+(salary*0.9));
			System.out.println("GrossSalary is" +grossSalary);
		}
		if(salary>=20000)
		{
			grossSalary=(float) (salary+(salary*0.3)+(salary*0.95));
			System.out.println("GrossSalary is" +grossSalary);
		}
			
	}
}
