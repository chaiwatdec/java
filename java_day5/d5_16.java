package java_day5;

import java.util.Arrays;
import java.util.Scanner;

public class d5_16
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
			for (int i = 0; i < x.length - 1; i++)
			{

				if (x[i] < x[i + 1])
				{
					int swap;
					swap = x[i + 1];
					x[i + 1] = x[i];
					x[i] = swap;
				}

			}
		}
		System.out.println(Arrays.toString(x));
		sc.close();
	}
}
