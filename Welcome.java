package program;
import java.util.Scanner;
public class Welcome {
	int n,k,j;
	void getInput()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the initial value of table");
		n =scan.nextInt();
		System.out.println("enter the final value of table");
		k =scan.nextInt();
		System.out.println("enter the j value");
		j =scan.nextInt();
		
		
	}
	
	void printWelcome()
	{
		
	for(int i=n ;i<=k;i++)
	
	{
		
		System.out.println(i+ " * "+j+ " = " +i*j);
	}
	}

}
