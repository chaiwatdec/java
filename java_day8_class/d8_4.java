package java_day8_class;

import java.util.Scanner;

public class d8_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		System.out.println(absolute(x));
		sc.close();
	}

	public static double absolute(double x)
	{
		if (x >= 0)
		{
			return x;

		} else
		{
			return x * -1;
		}

	}
}
