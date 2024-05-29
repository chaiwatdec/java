package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch4_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		double result = calculateExponential(n, n);

		System.out.println(result);
		sc.close();
	}

	public static double calculateExponential(double x, double n)
	{
		double sum = 1.0;
		for (double i = 1; i <= n; i++)
		{
			sum += Math.pow(x, i) / factorial(i);
		}
		return sum;
	}

	public static double factorial(double n)
	{
		if (n == 0)
			return 1;
		double fac = 1;

		for (int i = 1; i <= n; i++)
		{
			fac = fac * i;
		}
		return fac;
	}

}