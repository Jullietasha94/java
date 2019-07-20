                                   package program;

public class OPeratorBasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, i = 5, j = 6, k = 7, b = 6, a1 = 5, b1 = 6, c = 5;
		System.out.println(a++ + a++ + a++);
		System.out.println(a);
		System.out.println(i > j);
		System.out.println(i < k);
		System.out.println(!(k == 7));
		System.out.println((i < j) && (j < k));
		System.out.println((i < j) || (j > k));
		System.out.println((i < j) || (j < k));
		System.out.println(++c == b);
		System.out.println(--c == --b);
		System.out.println(c++ >= b++);
		System.out.println(c++ == b++);
		int p = 10;
		if (p >= 10)
			System.out.println("hi");
		int d = 5;
		if (d++ == 5)
			System.out.println("Hello");
		int e = 10;
		if (!(e == 100))
			System.out.println("eee");
		boolean result = a1 > b1;
		if (result)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");
		int n = 10;
		if (n > 10)

			System.out.println("hi");
		/* System.out.println("hello"); */

		else
			System.out.println("super");
		int box=1;
		while(box<=5000){
			System.out.println("box");
			box++;
		}

	}

}
