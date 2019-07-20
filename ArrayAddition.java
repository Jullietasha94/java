package program;
import java.util.Scanner;

public class ArrayAddition {
	int n=0,avg,l;
	int [] marks = new int[l];
/*int n=0,avg,l=5;*/
void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter l value");
		l=scan.nextInt();
		for(int i=0;i<l;i++)
		{
			System.out.println("enter 5 marks");
			marks[i]=scan.nextInt();
			/*n=n+marks[i];*/
			
		}
	}
		void add()
		{
			for(int i=0;i<5;i++)
			{
				n=n+marks[i];
			}
			avg =n/5;
			
		}
	
 void getOutput()
 {
	 for(int i=0;i<l;i++)
	 {
		 System.out.println(marks [i]);
	 }
	 System.out.println("Total is "+ n);
	 System.out.println("Average is" + avg);
 }
}
