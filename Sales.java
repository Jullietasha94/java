package program;
import java.util.Scanner;
 class Sales {
	float productprice;
	float discountrate;
	double discountamount;
	double saleprice;

	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product Prince");
		productprice = scan.nextFloat();
		System.out.println("Enter the discount Rate  ");
		discountrate = scan.nextFloat();
		
	}
	void findDiscount()
	{
		discountamount = (productprice * discountrate)/100;
		System.out.println("The Discount Amount is :" + discountamount);
		
	}
	void findSales()
	{
	     saleprice =productprice-discountamount; 
	     System.out.println("The Sale Price is"+ saleprice);
	}
}
