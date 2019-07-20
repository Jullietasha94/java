package program;
import java.util.Scanner;
public class ArrayRever {
 int[] number=new int[5];
 int[] temp=new int[5];

 int[] reverse=new int[5];
 int i=0;
 Scanner scan=new Scanner(System.in);
 public void getInput()
 {
	 //for(int i=0;i<5;i++)
	//{
	 if(i<5){
		 
		 System.out.println("enter the position of no"+i);
		 number[i]=scan.nextInt();
		 temp[i]=number[i];
		 i++;
		 getInput();
		 
	 }
	 }
 int j=4;
 public void display()
 {
 

 	 	//for(int j=4;j>=0;j--)
	if(j>=0)
	 {
		// reverse[j]=temp[j];
		 System.out.println(number[j]);
		 j--;
		 display();
	 }
 }
}

