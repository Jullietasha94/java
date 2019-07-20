package program;
import java.util.Scanner;

public class BiggestNumber {
	int number1;
	int number2;
void getInput()
{
	Scanner  scan =new Scanner (System.in);
	System.out.println("enter the number");
	number1 = scan.nextInt();
	System.out.println("enter another number");
	number2 = scan.nextInt();
}
	void findBiggestNumber()
	{
		if(number1>number2)
		{
			System.out.println(number1 +" is big");
		}
		else
		{
			System.out.println(number2 +" is big");
		}
	}
	

}
