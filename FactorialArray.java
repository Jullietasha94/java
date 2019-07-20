package program;

public class FactorialArray {
	int[] factorial=new int[10];
	int fact=1;
	public int[] factorial(int [] num )
	{
		for( int i=0;i<num.length;i++)
		{
			for(int j=1;j<num[i];j++)
			{
				fact=fact*j;
			}
			factorial[i]=fact;
		} 
		return factorial;
		
	}

}
