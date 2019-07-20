package program;
import java.util.Scanner;

public class ArrayRange {
	int k,l;
	int[] number=new int[10];
	Scanner scan=new Scanner(System.in);
	void getInput()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("enter a position number "+ i);
		    number[i]=scan.nextInt();			
		}
	}
	public void display()
	{
		System.out.println("enter starting and Ending Range");
		k=scan.nextInt();
		l=scan.nextInt();
		for(int i=k;i<=l;i++)
		{
			System.out.println(number[i]);
			
			
		}
	}

}
