package java_hw6_06_EF;

import java.util.Scanner;

public class EF1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] x = new double[4];
		double min = Integer.MAX_VALUE, sum = 0, pay;

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length; i++)
		{
			min = min(min, x[i]);
			sum = sum + x[i];
		}

		pay = sum - min;
		System.out.println((double) sum);
		System.out.println((double) pay);

		sc.close();
	}

	public static double min(double a, double b)
	{
		double min = Integer.MAX_VALUE;
		if (b > a)
		{
			min = a;

		} else
		{
			min = b;
		}

		return min;
	}
}
