package java_hw7_MATH;

import java.util.Scanner;

public class math7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Complex c1 = new Complex();
		c1.a = sc.nextDouble();
		c1.b = sc.nextDouble();
		Complex c2 = new Complex();
		c2.a = sc.nextDouble();
		c2.b = sc.nextDouble();

		Complex result = c1.mul(c2);

		System.out.println(result.a);
		System.out.println(result.b);
		
		Complex result2 = c1.div(c2);

		System.out.println(result2.a);
		System.out.println(result2.b);
		
		sc.close();
	}
}
