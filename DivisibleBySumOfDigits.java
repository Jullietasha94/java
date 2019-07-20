package program;

import java.util.Scanner;

public class DivisibleBySumOfDigits {
	private int n,rem,sum=0;
	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		n=scan.nextInt();
		
	}
	public void findBussinessLogic()
	{
		int i;
		i=n;
		while(i>0)
		{
			rem=i%10;
			i=i/10;
			sum=sum+rem;
		}
		/*System.out.println(sum);
		System.out.println(n);
		System.out.println(i);*/
	
		if(n%sum==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
	}
}
}