  package program;
import java .util.Scanner;
public class ArrayFactorial {
	int fact=1,n;
	int[] element=new int[5];
	int[] factorial=new int[5];
Scanner scan = new Scanner(System.in);

void getInput()
{
System.out.println("enter n value");
n=scan.nextInt();
for(int i=0;i<5;i++)
{
	System.out.println("enter no");
	element[i]=scan.nextInt();
}
}
/*public void display()
{
	for(int i=0;i<5;i++)
	{
		System.out.println(element[i]);
	}
}
*/
public void Factorial()
{
	int i;

	for(int j=0;j<n;j++)
	{
		
	for( i=0;i<=element[j];i++)
	{
		fact=fact*element[j];	
	}
	factorial[j]=fact;	
	}

}
public	void display1()
	{
		for(int k=0;k<5;k++)
		{
	System.out.println(element[k]+" "+factorial[k]);
	
	}
}
}