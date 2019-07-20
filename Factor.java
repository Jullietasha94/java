package program;
import java.util.Scanner;

public class Factor {
private int n;
public void getInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	n=scan.nextInt();
	
}
public void findFactor()
{
	for(int i=1;i<n;i++)
	{
		if(n % i==0)
		{
			System.out.println(i);
		}
	}
	
}
}
