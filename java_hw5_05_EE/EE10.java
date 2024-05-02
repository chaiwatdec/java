package java_hw5_05_EE;

import java.util.Scanner;

public class EE10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		double avg, sum = 0;

		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length; i++)
		{
			min = min(min, x[i]);
			max = max(max, x[i]);
			sum = sum + x[i];
		}

		avg = sum / x.length;

		System.out.println((double) max);
		System.out.println((double) min);
		System.out.println(avg);
		
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
