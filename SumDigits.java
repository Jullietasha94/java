package program;

import java.util.Scanner;

public class SumDigits {
private int n,rem, sum=0,sum1,add=0;
public void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter no");
	n=scan.nextInt();
}
public void findSumOfDigits()
{
	
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=sum+rem;
		
		
	}
	System.out.println(sum);
	
	
		while(sum>0)
		{
			sum1=sum%10;
			sum=sum/10;
			add=add+sum1;
			
		}
	
	
	System.out.println(add);
}
}
