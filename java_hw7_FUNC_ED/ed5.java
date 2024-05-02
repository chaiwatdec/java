package java_hw7_FUNC_ED;

import java.util.Scanner;

public class ed5
{
	public double ed5f(double a)
	{
		if (a < 0)
		{
			return a * -1;
		} else
		{
			return a;
		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();

		double result = (new ed5()).ed5f(a);

		System.out.println(result);

		sc.close();
	}
}
