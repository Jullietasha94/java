package program;

import java.util.Scanner;

public class ArraySwap {
	int n=0;

          int [] mark = new int[5];
		void getInput()
		{
			Scanner scan=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("enter 5 marks");
				mark[i]=scan.nextInt();
	}
		}
		void swap()
		{
			/*int a=5;*/
			for(int i=0;i<5;i++)
			{
				n= mark[2];
				mark[2]=mark[4];
				mark[4]=n;
				System.out.println(mark[i]);
				/*System.out.println(a++ + a++ + a++);*/
			}
		}

}
