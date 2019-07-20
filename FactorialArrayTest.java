package program;
import java.util.Scanner;

public class FactorialArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialArray a=new FactorialArray();
		int[] element=new int [10];
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("enter n value");
		n=scan.nextInt();
		for(int i=0;i<n;i++ )
		{
			System.out.println("enter element value");
			element[i]=scan.nextInt();
			
		}
		int [] result=a.factorial(element);
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}

	}

}
