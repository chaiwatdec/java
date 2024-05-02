package java_hw_05_ED;

import java.util.Scanner;

public class EH12
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		int maxkuu = Integer.MIN_VALUE, minkuu = Integer.MAX_VALUE;
		int maxkee = Integer.MIN_VALUE, minkee = Integer.MAX_VALUE;
		for (int i = 0; i < 10; i++)
		{
			int n = sc.nextInt();

			if (n % 2 == 0)
			{
				maxkuu = max(maxkuu, n);
				minkuu = min(minkuu, n);
			} else
			{
				maxkee = max(maxkee, n);
				minkee = min(minkee, n);
			}
		}

		System.out.println(maxkee);
		System.out.println(minkee);
		System.out.println(maxkuu);
		System.out.println(minkuu);

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
