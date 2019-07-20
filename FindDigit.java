package program;
import java.util.Scanner;

public class FindDigit {
	int no;
	void getInput() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		no=scan.nextInt();
	}
	
	void findDigit()
	{
		if(((no>9) && (no<=99))||((no<-9) && (no>=-99)))
		{
			System.out.println("Two digit number");
		}
		else if(((no>=100)&& (no<=999))||(no<=-100)&& (no>=-999))
		{
			System.out.println("Three digit number");
		} 
		else if((no>=1000)&& (no<=9999))
		{
			System.out.println("Four Digit number");
		}
		else
		{
			System.out.println("Invalid no ");
		}
	}	

}
