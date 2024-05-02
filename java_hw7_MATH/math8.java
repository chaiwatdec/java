package java_hw7_MATH;

import java.util.Scanner;

public class math8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Complex c1 = new Complex();
		c1.a = sc.nextDouble();
		c1.b = sc.nextDouble();

		Complex result = c1.inv();

		System.out.println(result.a);
		System.out.println(result.b);
		
		Complex result2 = c1.conj();

		System.out.println(result2.a);
		System.out.println(result2.b);
		
		sc.close();
	}
}
