package java_hw_05_ED;

import java.util.Arrays;
import java.util.Scanner;

public class EH14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();

			max = max(max, x[i]);
			min = min(min, x[i]);
		}

		for (int j = 0; j < x.length; j++)
		{
			for (int i = 0; i < x.length - 1; i++)
			{
				if (x[i] > x[i + 1])
				{
					int swap;
					swap = x[i];
					x[i] = x[i + 1];
					x[i + 1] = swap;
				}
			}
		}

		System.out.println(max);
		System.out.println(min);
		System.out.println(Arrays.toString(x));

		sc.close();
	}

	public static int max(int a, int b)
	{
		int max = Integer.MIN_VALUE;
		if (b < a)
		{
			max = a;

		} else
		{
			max = b;
		}

		return max;
	}

	public static int min(int a, int b)
	{
		int min = Integer.MAX_VALUE;
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