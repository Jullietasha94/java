
package program;
import java.util.Scanner;

public class Distance {
	int x1,x2,y1,y2,a,b,i,j;
	double x,y,z;
	double distance;
	float slope;
void getinput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a no");
	x1= scan.nextInt();
	System.out.println("Enter a no");
	x2= scan.nextInt();
	System.out.println("Enter a no");
	y1= scan.nextInt();
	System.out.println("Enter a no");
	y2= scan.nextInt();
	System.out.println("Enter a no");
	i= scan.nextInt();
	System.out.println("Enter a no");
	j= scan.nextInt();
	}
void distance()
{
	a=x2-x1;
	b=y2-y1;
	x= Math.pow(a, 2);
    y =Math.pow(b, 2);
    z=x+y;
    distance = Math.sqrt(z);
	System.out.println("The Distance " + distance);
}
void slope()
{
	slope = b/a;
	System.out.println("The slope of line" + slope);
}
void swap()

{
	i=i*j;
	j=i/j;
	i=i/j;
	System.out.println("i value is"+ i);
	System.out.println("j value is"+ j);
			
	
}

}
