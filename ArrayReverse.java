package program;
import java.util.Scanner;

public class ArrayReverse
{
	private  int[] numbers=new int[5];
	int num,temp,renum;
	 Scanner scan = new Scanner(System.in);
	 public void getInput()
	 {
		System.out.println("enter the number");
		 for(int i=0;i<=4;i++)
		 { 
			 numbers[i]=scan.nextInt();
		 }
	 }
	public  void businessLogic()
	{  
		System.out.println("enter a number to get replaced");
		num=scan.nextInt();
		System.out.println("enter a number to replace");
		renum=scan.nextInt();
		//renum=temp;
		
		for (int i = 0; i <= 4; i++) {
			if (num == numbers[i]) {

				numbers[i]=renum ;

			} else if (renum == numbers[i]) {

				numbers[i]=num ;
			}

			System.out.println(numbers[i]);
			//System.out.println("The number " + numbers[i] + " is change " + renum);
			//System.out.println("The number " + numbers[i] + " is change " + num);
		}
	}

	// for(int i=0;i<=4;i++){
		//System.out.println(numbers[i]);
		
		
	
	 

}
