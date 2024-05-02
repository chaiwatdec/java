package java_hw7_MATH;

import java.util.Scanner;

public class math2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Fraction f1 = new Fraction();
		f1.N = sc.nextInt();
		f1.D = sc.nextInt();
		Fraction f2 = new Fraction();
		f2.N = sc.nextInt();
		f2.D = sc.nextInt();

		Fraction result1 = f1.add(f2);

		System.out.println(result1.N);
		System.out.println(result1.D);

		Fraction result2 = f1.minus(f2);

		System.out.println(result2.N);
		System.out.println(result2.D);

		sc.close();
	}
}