package program;
import java.util.Scanner;

public class ArrayAdd {
	private  int[] numbers=new int[5];
	int num,count=0;
	int max=0,min;
 Scanner scan = new Scanner(System.in);
 public void getInput()
 {
	System.out.println("enter the number");
	 for(int i=0;i<=4;i++)
	 { 
		 numbers[i]=scan.nextInt();
	 }
 }
 public void disPlay()
 {
	 for(int j=0;j<=4;j++)
	 {
		 System.out.println(numbers[j]);
	 }
	 System.out.println("enter the no to find");
	 num=scan.nextInt();
 }
 
public void findNumber()
{
	 for(int k=0;k<=4;k++)
	 {
		 if(num==numbers[k])
		 {
			 System.out.println(num+"in position"+k);
			 count++;
		 }
		 
 } 
	 System.out.println(num +"fount in a Array"+count+"times");
	 
}
public int max()
{
	
	 for(int m=0;m<=4;m++)
 {
	 	 if(numbers[m]>max)
	 {
		 max=numbers[m];
	 }
	 
	 }
	 System.out.println("maximum no is"+max);
	 return(max);
	 
}
public void min()
{ int min=numbers[0];
	 {
		 for(int n=0;n<=4;n++)
		 {
			 if(numbers[n]<min)
			 {
				 min=numbers[n];
			 }
		 }
	 }
	 System.out.println("minimum no is"+min);
}
}