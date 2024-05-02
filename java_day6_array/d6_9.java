package java_day6_array;

import java.util.Scanner;

public class d6_9
{
	public static void main(String[] args)
	{
		// integrate polynomial
		int x[] = new int[100];
		double y[] = new double[100];
		int max_power = 0, i = 0, k;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter MAX Power: ");
		max_power = sc.nextInt();

		while (true)
		{
			System.out.print("Enter coef (or -999): ");
			k = sc.nextInt();
			if (k == -999)
			{
				break;
			}
			x[i] = k;
			i++;
		}

		double a, b;

		System.out.print("Enter border a: ");
		a = sc.nextDouble();
		System.out.print("Enter border b: ");
		b = sc.nextDouble();
		sc.close();

		for (int j = 0; j < i; j++)
		{
			if (max_power - j != -1)
			{
				y[j] = (double) x[j] / (max_power + i - j);
			} else
			{
				y[j] = (double) x[j];
			}
		}

		double sum_a, sum_b;
		sum_a = 0;
		sum_b = 0;

		for (int j = 0; j < i; j++)
		{
			if (max_power - j != -1)
			{
				sum_a += y[j] * Math.pow(a, max_power + 1 - j);
				sum_b += y[j] * Math.pow(b, max_power + 1 - j);
			} else
			{
				sum_a += y[j] * Math.log(a);
				sum_b += y[j] * Math.log(b);
			}
		}
		System.out.println(sum_b - sum_a);
		sc.close();
	}
}
