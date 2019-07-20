package program;
import java.util.Scanner;

public class CurrencyValue {
	int money;
	String country;
	double inr;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter country and money");
		money=scan.nextInt();
		country=scan.next();	
	}
	void findCurrencyValue()
	{
		if(country.equals("Armaina"))
		{
			inr=0.1487*money;
			System.out.println("The INR value is" + inr);
		}
		if(country.equals("China"))
		{
			inr=10.513*money;
			System.out.println("The INR value is" + inr);
		}
	}
	

}
