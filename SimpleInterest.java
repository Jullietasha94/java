package program;

public class SimpleInterest {
	int principle;
	int no_of_year;
	int rate;
	float simpleinterest;
  SimpleInterest(int i, int j,int k)
  {
	  principle=i;
	  no_of_year=j;
	  rate=k;
	  
  }
  void calculateSimpleInterest()
  {
	  simpleinterest=((principle*no_of_year*rate)/100);
	  System.out.println("Simple interest :"+ simpleinterest);
	  
  }
  /*public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest a1=new SimpleInterest();
		a1.calculateSimpleInterest();
		

	}*/


}
