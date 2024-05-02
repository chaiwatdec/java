package java_day4;

import java.util.Scanner;

public class d4_05
{
	public static void main(String[] args)
	{

		int i = 1, n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		int sum = 0;
		double avg, lp;

		Scanner sc = new Scanner(System.in);
		System.out.print("Input loop: ");
		lp = sc.nextDouble();

		while (i <= lp)
		{
			System.out.print("Input n: ");
			n = sc.nextInt();
			sum = sum + n;

			if (n > max)
			{
				max = n;

			}

			if (n < min)
			{
				min = n;
			}

			i++;
		}

		avg = sum / lp;
		System.out.println("avg: " + avg);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		sc.close();
	}
}
