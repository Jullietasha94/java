package program;

import java.util.Scanner;

public class Vowels {
	char ch;
	void getinput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter char");
		ch=scan.next().charAt(0);
	}
	void volwels()
	{
		
	if( ch ='a'|| ch='e'||'i','o','u')
	{
		System.out.println("It is a vowels");
	}
	else
	{
		System.out.println("it is a constands");
	}
	}

}
