package program;
import java.util.Scanner;
public class ArrayNumbers {
	private int[] numbers= new int[5];
	Scanner scan=new Scanner(System.in);
public void getInput()
{
	for(int i=0;i<=4;i++)
	{
		System.out.println("enter no");
		numbers[i]=scan.nextInt();
		
	}
}
	public void findBusinessLogic()
	{
		for(int i=0;i<=4;i++)
		{
			if(numbers[i]>0)
			{
				System.out.println(numbers[i] +" Positive Number");
			}
			else if(numbers[i]<0)
			{
				System.out.println(numbers[i] +" negative no");
			}
			else
			{
				System.out.println(numbers[i] +" neutural number");
			}
		}
	}

}
