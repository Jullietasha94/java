package program;

import java.util.Scanner;

class EBUnit {
	float unit;
	double ebBill;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter EB Unit");
		unit=scan.nextFloat();
	}
	void findEBBill()
	{
		if(unit>0 && unit<=100)
		{
			ebBill=unit*5;
			System.out.println("EBbill is"+ebBill);
		}
		else if(unit>101 && unit<=200)
		{
			ebBill=(500+((unit-100)*7));
			System.out.println("EBbill is"+ebBill);
		}
		else if(unit>201 && unit<=300)
		{
			ebBill=(500+700+(unit-200)*10);
			System.out.println("EBbill is"+ebBill);
		}
		else
		{
			ebBill=(500+700+1000+(unit-300)*15);
			System.out.println("EBbill is"+ebBill);
		}
	}

}
