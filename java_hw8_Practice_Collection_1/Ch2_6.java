package java_hw8_Practice_Collection_1;

import java.util.Scanner;

public class Ch2_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double number = sc.nextDouble();

		if (number < 0)
		{

		} else
		{
			double fac = fac(number);
			System.out.println(fac);
		}

		sc.close();
	}

	public static double fac(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			return n * fac(n - 1);
		}
	}
}
