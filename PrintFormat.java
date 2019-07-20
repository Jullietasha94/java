package program;
import java.util.Scanner;

public class PrintFormat {
String name;
int rollno;
String fieldOfInterest ;
void getinput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter name");
	name=scan.next();
	System.out.println("enter rollno");
	rollno=scan.nextInt();
	System.out.println("enter Field of interest");
	fieldOfInterest =scan.next();	
} 
void display()
{
	System.out.println("Hey, my name is "+name+ " and my roll number is "+ rollno+ ". my Field of Interest are " +fieldOfInterest+".");

}
}
