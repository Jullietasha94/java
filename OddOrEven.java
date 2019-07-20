package program;

import java.util.Scanner;

public class OddOrEven {
	int number;
void getInput()
{
	Scanner  scan =new Scanner (System.in);
	System.out.println("enter the number");
	number = scan.nextInt();
}
	void findOddorEven()
	{
		
		if((number % 2 ==1))
		{
			System.out.println(number +"is odd no");
		}
		else
		{
			System.out.println(number +"is even no");
		}
	}

}
