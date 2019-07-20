package program;
import java.util.Scanner;

public class Triangle {
	int breath;
	int height;
	double area;
	void getInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the breath value");
		breath=scan.nextInt();
		System.out.println("enter the height value");
		height=scan.nextInt();
	}
	void findArea()
	{
		area= (0.5*breath*height);
		System.out.println("The area of triangle is" + area);
	}
	

}
