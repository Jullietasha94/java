package program;

import java.util.Scanner;

public class AdditionProgram {
	int number1,number2 ,number3,add,avg;
void getInput()
{
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the value");
	number1 =scan.nextInt();
	System.out.println("enter the  value ");
	number2 =scan.nextInt();
	System.out.println("enter the  value");
	number3=scan.nextInt();
}
void addnumbers ()
	{
		add=number1+number2+number3;
		System.out.println("The sum value is" + add);
	}
void average()
{
	avg= add/3;
	System.out.println("the avg value" + avg);
	
		
	}
}


