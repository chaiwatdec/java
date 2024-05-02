package java_hw7_MATH;

import java.util.Scanner;

public class math1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Fraction f1 = new Fraction();
		f1.N = sc.nextInt();
		f1.D = sc.nextInt();

		Fraction result = f1.reduce();
		
		System.out.println(result.N);
		System.out.println(result.D);

		sc.close();
	}
}
