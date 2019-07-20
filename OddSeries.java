package program;

import java.util.Scanner;
class OddSeries {
	int n;

	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		n= scan.nextInt();
		System.out.println("the odd series");
	}
	
	
 void findOdd()
{
	for(int i=1;i<=n ;i+=2)
	{
		System.out.print(i+" ");
	}
}
}
