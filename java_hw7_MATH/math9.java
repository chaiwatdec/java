package java_hw7_MATH;

import java.util.Scanner;

public class math9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Complex c1 = new Complex();
		c1.a = sc.nextDouble();
		c1.b = sc.nextDouble();

		double result = c1.size();

		System.out.println(result);
		
		double result2 = c1.angle();

		System.out.println(result2);
		
		sc.close();
	}
}
