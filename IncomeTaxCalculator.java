package program;
import java.util.Scanner;

public class IncomeTaxCalculator {
	int income;
	double incomeTax;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter taxable income");
		income=scan.nextInt();
		
		
	}
	void findBussinessLogic()
	{
		if(income<=20000)
		{
			System.out.println("no tax");
		}
		else if((income>20000)&&(income<=40000))
				{
			       incomeTax = (income-20000)*(0.1 );
			       System.out.println(incomeTax);
				}
		else if((income>40001)&&(income<=60000))
		{
	       incomeTax =( (20000*0.1)+((income-40000)*0.2));
	       System.out.println("incomeTax"+incomeTax);
		}
		else if((income>60001))
		{
	       incomeTax = ((20000*0.1)+(20000*0.02)+((income-60000)*0.03));
	       System.out.println(incomeTax);
		}
	}

}
