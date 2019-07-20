package program;
import java.util.Scanner;
public class Average {
	boolean a=true;
	char ch='q';
	int  sum=0,count=0,n;
	float avg;
void logic()
{ 
	Scanner scan=new Scanner(System.in );
	/*System.out.println("enter value");*/
	
	
	while(a)
	{
		
		System.out.println("enter value");
		n=scan.nextInt();
		sum=sum+n;
		count++;
	System.out.println("Do you want to quiet press q");
	
	ch=scan.next().charAt(0);
	if(ch=='q')
	{
	
		a=false;
	}
	}
	System.out.println(sum);
    avg=(float)sum/count;
   System.out.println(avg);
}
}
