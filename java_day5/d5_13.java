package java_day5;

import java.util.Scanner;

public class d5_13
{
	public static void main(String[] args)
	{
		int max = Integer.MIN_VALUE;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			if (x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}
