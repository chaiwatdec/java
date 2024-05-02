package java_day5;

import java.util.Arrays;
import java.util.Scanner;

public class d5_18
{
	public static void main(String[] args)
	{
		// bubble sort, sort max to min
		Scanner sc = new Scanner(System.in);

		int[] x = new int[10];

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int j = 0; j < x.length; j++)
		{
			for (int i = 0; i < x.length - 1 - j; i++)
			{
				if (x[i] < x[i + 1])
				{
					int swap;
					swap = x[i];
					x[i] = x[i + 1];
					x[i + 1] = swap;
				}

			}
		}
		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
